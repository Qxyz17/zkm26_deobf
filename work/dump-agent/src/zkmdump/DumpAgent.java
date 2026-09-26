package zkmdump;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.io.*;
import java.util.concurrent.ConcurrentHashMap;

public class DumpAgent {
    private static final ConcurrentHashMap<String, Integer> seen = new ConcurrentHashMap<>();
    private static File outDir;

    public static void premain(String args, Instrumentation inst) {
        String dir = System.getProperty("zkmdump.dir", "zkm-patched");
        outDir = new File(dir);
        outDir.mkdirs();
        System.out.println("[ZKM-DUMP] dump dir = " + outDir.getAbsolutePath());
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className,
                                    Class<?> classBeingRedefined,
                                    ProtectionDomain pd, byte[] classfileBuffer) {
                if (className == null || classfileBuffer == null) return null;
                if (!className.startsWith("com/zelix/")) return null;
                try {
                    String key = className + "#" + classfileBuffer.length;
                    int n = seen.merge(key, 1, Integer::sum);
                    String safe = className.replace('/', '.');
                    String fname = safe + "$" + classfileBuffer.length + (n > 1 ? "$v" + n : "") + ".class";
                    File f = new File(outDir, fname);
                    if (!f.exists()) {
                        try (FileOutputStream fos = new FileOutputStream(f)) {
                            fos.write(classfileBuffer);
                        }
                        System.out.println("[ZKM-DUMP] " + (classBeingRedefined != null ? "REDEF " : "LOAD  ")
                                + className + " -> " + fname);
                    }
                } catch (Throwable t) {
                    System.out.println("[ZKM-DUMP] err on " + className + ": " + t);
                }
                return null; // 绝不修改
            }
        });
    }
}
