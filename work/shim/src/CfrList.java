import org.benf.cfr.reader.Main;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class CfrList {
    public static void main(String[] args) throws Exception {
        String listFile = args[0];
        String outDir = args[1];
        int timeoutSec = Integer.parseInt(args[2]);
        int maxSeconds = Integer.parseInt(args[3]);

        List<String> lines = Files.readAllLines(Paths.get(listFile));
        long start = System.currentTimeMillis();
        int done = 0, skip = 0;
        ExecutorService pool = Executors.newSingleThreadExecutor();
        for (String line : lines) {
            String f = line.trim();
            if (f.isEmpty()) continue;
            if ((System.currentTimeMillis() - start) / 1000 > maxSeconds) {
                System.out.println("时间到. done=" + done + " skip=" + skip);
                break;
            }
            final String ff = f;
            Future<?> fut = pool.submit(() -> {
                try { Main.main(new String[]{ff, "--outputdir", outDir, "--comments", "false", "--silent", "true"}); }
                catch (Throwable t) {}
            });
            try { fut.get(timeoutSec, TimeUnit.SECONDS); done++; System.out.println("OK " + new File(f).getName()); }
            catch (TimeoutException te) { fut.cancel(true); skip++; System.out.println("TIMEOUT " + new File(f).getName()); }
        }
        pool.shutdownNow();
        System.out.println("完成. done=" + done + " timeout=" + skip);
    }
}
