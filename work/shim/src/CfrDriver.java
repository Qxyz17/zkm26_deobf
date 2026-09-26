import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CfrDriver {
    public static void main(String[] args) throws Exception {
        String javaExe = args[0];
        String cfrJar = args[1];
        String inDir = args[2];
        String outDir = args[3];
        long timeoutMs = Long.parseLong(args[4]);
        int maxSeconds = Integer.parseInt(args[5]);

        List<File> classes = new ArrayList<>();
        Files.walk(Paths.get(inDir)).filter(p -> p.toString().endsWith(".class")).forEach(p -> classes.add(p.toFile()));
        classes.sort(Comparator.comparingLong(File::length));

        new File(outDir).mkdirs();
        long start = System.currentTimeMillis();
        int done = 0, skip = 0, exists = 0;

        for (File f : classes) {
            if ((System.currentTimeMillis() - start) / 1000 > maxSeconds) {
                System.out.println("时间预算到. done=" + done + " skip=" + skip + " exists=" + exists);
                break;
            }
            String base = f.getName().substring(0, f.getName().length() - 6);
            // 检查是否已生成
            File exp = new File(outDir, base + ".java");
            if (findGenerated(outDir, base)) { exists++; continue; }

            ProcessBuilder pb = new ProcessBuilder(javaExe, "-Xmx2g", "-jar", cfrJar, f.getAbsolutePath(),
                    "--outputdir", outDir, "--comments", "false", "--silent", "true");
            pb.redirectErrorStream(true);
            Process p = pb.start();
            // 消费输出防止缓冲满
            Thread drain = new Thread(() -> {
                try (InputStream is = p.getInputStream()) {
                    byte[] buf = new byte[8192];
                    while (is.read(buf) > 0) {}
                } catch (Exception e) {}
            });
            drain.setDaemon(true);
            drain.start();

            boolean finished = p.waitFor(timeoutMs, java.util.concurrent.TimeUnit.MILLISECONDS);
            if (finished) { done++; }
            else { p.destroyForcibly(); skip++; }
        }
        System.out.println("完成. done=" + done + " timeout=" + skip + " 已存在=" + exists);
    }

    static boolean findGenerated(String outDir, String base) {
        // 简单检查：outDir/base.java 或 outDir/**/base.java
        File direct = new File(outDir, base + ".java");
        if (direct.exists()) return true;
        return false;
    }
}
