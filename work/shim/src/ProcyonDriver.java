import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class ProcyonDriver {
    public static void main(String[] args) throws Exception {
        String listFile = args[0];
        String outDir = args[1];
        int timeoutSec = Integer.parseInt(args[2]);
        String procyonJar = args[3];
        String javaExe = "C:\\Program Files\\Zulu\\zulu-11\\bin\\java.exe";

        List<String> lines = Files.readAllLines(Paths.get(listFile));
        int done = 0, skip = 0;
        for (String line : lines) {
            String f = line.trim();
            if (f.isEmpty()) continue;
            ProcessBuilder pb = new ProcessBuilder(javaExe, "-Xmx3g", "-jar", procyonJar, "-o", outDir, f);
            pb.redirectErrorStream(true);
            Process p = pb.start();
            Thread drain = new Thread(() -> { try (InputStream is = p.getInputStream()) { byte[] b = new byte[8192]; while (is.read(b) > 0) {} } catch (Exception e) {} });
            drain.setDaemon(true); drain.start();
            boolean fin = p.waitFor(timeoutSec, TimeUnit.SECONDS);
            if (fin && p.exitValue() == 0) { done++; System.out.println("OK " + new File(f).getName()); }
            else { if (!fin) p.destroyForcibly(); skip++; System.out.println("FAIL " + new File(f).getName()); }
        }
        System.out.println("完成. done=" + done + " fail=" + skip);
    }
}
