import java.io.*;
import java.nio.file.*;
import java.lang.reflect.*;
import java.util.*;

public class StringDumpAll2 {
    public static void main(String[] args) throws Exception {
        String classesRoot = args[0];
        String outFile = args[1];
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        List<Path> classes = new ArrayList<>();
        Files.walk(Paths.get(classesRoot)).filter(p -> p.toString().endsWith(".class")).forEach(classes::add);
        int ok = 0, fail = 0, strs = 0;
        for (Path p : classes) {
            String rel = Paths.get(classesRoot).relativize(p).toString().replace('\\', '/');
            String cn = rel.substring(0, rel.length() - 6).replace('/', '.');
            try {
                Class<?> c = Class.forName(cn);
                List<String> found = new ArrayList<>();
                for (Field f : c.getDeclaredFields()) {
                    if (!Modifier.isStatic(f.getModifiers())) continue;
                    try {
                        f.setAccessible(true);
                        if (f.getType() == String.class) {
                            Object v = f.get(null);
                            if (v != null && !((String) v).isEmpty()) { found.add(f.getName() + " = " + v); strs++; }
                        } else if (f.getType() == String[].class) {
                            Object v = f.get(null);
                            if (v != null) {
                                String[] arr = (String[]) v;
                                for (int i = 0; i < arr.length; i++) {
                                    if (arr[i] != null && !arr[i].isEmpty()) { found.add(f.getName() + "[" + i + "] = " + arr[i]); strs++; }
                                }
                            }
                        }
                    } catch (Throwable t) {}
                }
                if (!found.isEmpty()) {
                    pw.println("### " + cn);
                    for (String s : found) pw.println("  " + s);
                }
                ok++;
            } catch (Throwable t) {
                fail++;
            }
        }
        pw.flush(); pw.close();
        System.out.println("ok=" + ok + " fail=" + fail + " strings=" + strs);
    }
}
