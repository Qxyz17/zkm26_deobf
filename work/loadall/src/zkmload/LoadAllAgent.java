package zkmload;
import java.lang.instrument.Instrumentation;
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class LoadAllAgent {
    public static void agentmain(String args, Instrumentation inst) {
        System.out.println("[LOADALL] agentmain args=" + args);
        String[] parts = args.split("\\|");
        String jarPath = parts[0];
        String outDir = parts[1];
        File out = new File(outDir);
        out.mkdirs();

        // 找到 ZKM 的 classloader
        ClassLoader zkmLoader = null;
        for (Class<?> c : inst.getAllLoadedClasses()) {
            if (c.getName().equals("com.zelix.ZKM") || c.getName().startsWith("com.zelix.")) {
                zkmLoader = c.getClassLoader();
                System.out.println("[LOADALL] 找到 com.zelix loader: " + zkmLoader + " via " + c.getName());
                break;
            }
        }
        if (zkmLoader == null) { System.out.println("[LOADALL] 找不到 com.zelix loader"); return; }

        int loaded = 0, failed = 0;
        try (ZipFile zf = new ZipFile(jarPath)) {
            Enumeration<? extends ZipEntry> en = zf.entries();
            while (en.hasMoreElements()) {
                ZipEntry ze = en.nextElement();
                String n = ze.getName();
                if (!n.endsWith(".class") || n.startsWith("META-INF/") || n.startsWith("proguard/")) continue;
                String cn = n.substring(0, n.length() - 6).replace('/', '.');
                try {
                    Class.forName(cn, false, zkmLoader);
                    loaded++;
                } catch (Throwable t) {
                    failed++;
                    if (failed < 6) System.out.println("[LOADALL] fail: " + cn + " -> " + t);
                }
            }
        } catch (Throwable t) { System.out.println("[LOADALL] " + t); }
        System.out.println("[LOADALL] loaded=" + loaded + " failed=" + failed);

        int dumped = 0;
        for (Class<?> c : inst.getAllLoadedClasses()) {
            String name = c.getName();
            if (!name.startsWith("com.zelix.")) continue;
            try {
                String res = "/" + name.replace('.', '/') + ".class";
                InputStream is = c.getResourceAsStream(res);
                if (is == null) continue;
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[8192]; int n2;
                while ((n2 = is.read(buf)) > 0) bos.write(buf, 0, n2);
                is.close();
                File f = new File(out, name + ".class");
                try (FileOutputStream fos = new FileOutputStream(f)) { fos.write(bos.toByteArray()); }
                dumped++;
            } catch (Throwable t) {}
        }
        System.out.println("[LOADALL] dump=" + dumped + " 到 " + out.getAbsolutePath());
    }
}
