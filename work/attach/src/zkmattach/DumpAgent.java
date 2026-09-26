package zkmattach;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.io.*;
import java.util.*;

public class DumpAgent {
    static File outDir;
    public static void agentmain(String args, Instrumentation inst) {
        System.out.println("[ATTACH-DUMP] agentmain, args=" + args);
        outDir = new File(args != null && !args.isEmpty() ? args : "zkm-attach-dump");
        outDir.mkdirs();
        System.out.println("[ATTACH-DUMP] dump dir = " + outDir.getAbsolutePath());

        // 直接遍历已加载的类，dump 其字节码
        Class<?>[] loaded = inst.getAllLoadedClasses();
        System.out.println("[ATTACH-DUMP] 已加载类总数 = " + loaded.length);
        int dumped = 0;
        for (Class<?> c : loaded) {
            String name = c.getName();
            if (!name.startsWith("com.zelix.")) continue;
            try {
                // 用 getResourceAsStream 拿原始字节（对已加载类，拿到的是 classloader 的版本）
                String res = "/" + name.replace('.', '/') + ".class";
                InputStream is = c.getResourceAsStream(res);
                if (is == null) {
                    System.out.println("[ATTACH-DUMP] 无法读取 " + name);
                    continue;
                }
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[8192]; int n;
                while ((n = is.read(buf)) > 0) bos.write(buf, 0, n);
                is.close();
                byte[] data = bos.toByteArray();
                File f = new File(outDir, name + ".class");
                try (FileOutputStream fos = new FileOutputStream(f)) { fos.write(data); }
                dumped++;
                if (dumped <= 20) System.out.println("[ATTACH-DUMP] " + name + " " + data.length + " bytes");
            } catch (Throwable t) {}
        }
        System.out.println("[ATTACH-DUMP] 共 dump " + dumped + " 个类到 " + outDir.getAbsolutePath());
    }
    public static void premain(String args, Instrumentation inst) { agentmain(args, inst); }
}
