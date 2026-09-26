package zkmhook;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class Agent {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("[ZKM-HOOK] agent attached");
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className,
                                    Class<?> classBeingRedefined,
                                    ProtectionDomain pd, byte[] classfileBuffer) {
                if (className == null) return null;
                if (!className.equals("com/zelix/m44")) return null;
                System.out.println("[ZKM-HOOK] intercepting com/zelix/m44, " + classfileBuffer.length + " bytes");
                try {
                    return M44Transformer.transform(classfileBuffer);
                } catch (Throwable t) {
                    System.out.println("[ZKM-HOOK] transform failed: " + t);
                    t.printStackTrace();
                    return null;
                }
            }
        });
    }
}
