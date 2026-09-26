import org.benf.cfr.reader.Main;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class CfrApi {
    public static void main(String[] args) throws Exception {
        String inDir = args[0];
        String outDir = args[1];
        int maxSeconds = Integer.parseInt(args[2]);
        long minSize = args.length > 3 ? Long.parseLong(args[3]) : 0;
        long maxSize = args.length > 4 ? Long.parseLong(args[4]) : Long.MAX_VALUE;

        List<File> classes = new ArrayList<>();
        Files.walk(Paths.get(inDir)).filter(p -> p.toString().endsWith(".class")).forEach(p -> classes.add(p.toFile()));
        classes.sort(Comparator.comparingLong(File::length));

        long start = System.currentTimeMillis();
        int done = 0, skip = 0, outOfRange = 0;
        ExecutorService pool = Executors.newSingleThreadExecutor();

        for (File f : classes) {
            if (f.length() < minSize || f.length() > maxSize) { outOfRange++; continue; }
            if ((System.currentTimeMillis() - start) / 1000 > maxSeconds) {
                System.out.println("时间到. range=[" + minSize + "," + maxSize + "] done=" + done + " skip=" + skip);
                break;
            }
            final File ff = f;
            Future<?> fut = pool.submit(() -> {
                try { Main.main(new String[]{ff.getAbsolutePath(), "--outputdir", outDir, "--comments", "false", "--silent", "true"}); }
                catch (Throwable t) {}
            });
            try { fut.get(6, TimeUnit.SECONDS); done++; }
            catch (TimeoutException te) { fut.cancel(true); skip++; }
        }
        pool.shutdownNow();
        System.out.println("完成. range=[" + minSize + "," + maxSize + "] done=" + done + " timeout=" + skip + " 范围外=" + outOfRange);
    }
}
