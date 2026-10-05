import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class VineDriver2 {
    public static void main(String[] args) throws Exception {
        String listFile = args[0];
        String classesRoot = args[1];
        String outDir = args[2];
        int timeoutSec = Integer.parseInt(args[3]);
        int maxSeconds = Integer.parseInt(args[4]);
        String vfJar = args[5];
        String javaExe = "C:\\Program Files\\Zulu\\zulu-17\\bin\\java.exe";

        Path root = Paths.get(classesRoot).toAbsolutePath().normalize();
        List<String> lines = Files.readAllLines(Paths.get(listFile));
        long start = System.currentTimeMillis();
        int done = 0, skip = 0, exists = 0;
        for (String line : lines) {
            String f = line.trim();
            if (f.isEmpty()) continue;
            if ((System.currentTimeMillis() - start) / 1000 > maxSeconds) { System.out.println("TIMEUP done=" + done + " fail=" + skip + " exists=" + exists); break; }
            Path cp = Paths.get(f).toAbsolutePath().normalize();
            String rel = root.relativize(cp).toString().replace('\\', '/');
            String outRel = rel.substring(0, rel.length() - 6) + ".java";
            Path outPath = Paths.get(outDir, outRel);
            if (Files.exists(outPath) && Files.size(outPath) > 0) { exists++; continue; }
            Files.createDirectories(outPath.getParent());
            ProcessBuilder pb = new ProcessBuilder(javaExe, "-Xmx2g", "-jar", vfJar, "--silent", f, outDir);
            pb.redirectErrorStream(true);
            Process p = pb.start();
            Thread drain = new Thread(() -> { try (InputStream is = p.getInputStream()) { byte[] b = new byte[8192]; while (is.read(b) > 0) {} } catch (Exception e) {} });
            drain.setDaemon(true); drain.start();
            boolean fin = p.waitFor(timeoutSec, TimeUnit.SECONDS);
            if (fin && p.exitValue() == 0) { done++; System.out.println("OK " + rel); }
            else { if (!fin) p.destroyForcibly(); skip++; System.out.println("FAIL " + rel); }
            System.out.flush();
        }
        System.out.println("DONE done=" + done + " fail=" + skip + " exists=" + exists);
    }
}
