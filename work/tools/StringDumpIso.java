import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.lang.reflect.*;
import java.util.*;

public class StringDumpIso {
    public static void main(String[] args) throws Exception {
        String classesRoot = args[0];
        String outFile = args[1];
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        List<Path> classes = new ArrayList<>();
        Files.walk(Paths.get(classesRoot)).filter(p -> p.toString().endsWith(".class")).forEach(classes::add);
        URL[] urls = new URL[]{ Paths.get(classesRoot).toUri().toURL() };
        int ok = 0, fail = 0, strs = 0;
        for (Path p : classes) {
            String rel = Paths.get(classesRoot).relativize(p).toString().replace('\\', '/');
            String cn = rel.substring(0, rel.length() - 6).replace('/', '.');
            URLClassLoader cl = null;
            try {
                cl = new URLClassLoader(urls, ClassLoader.getPlatformClassLoader());
                Class<?> c = Class.forName(cn, true, cl);
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
            } finally {
                if (cl != null) try { cl.close(); } catch (Throwable t) {}
            }
        }
        pw.flush(); pw.close();
        System.out.println("ok=" + ok + " fail=" + fail + " strings=" + strs);
    }
}
