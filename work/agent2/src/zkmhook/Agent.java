package zkmhook;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;

public class Agent {
    public static void premain(String args, Instrumentation inst) {
        System.err.println("[ZKM-HOOK] agent attached");
        inst.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className,
                                    Class<?> classBeingRedefined,
                                    ProtectionDomain pd, byte[] classfileBuffer) {
                if (className == null) return null;
                if (!className.equals("com/zelix/x44")) return null;
                System.err.println("[ZKM-HOOK] intercepting com/zelix/x44");
                try {
                    return X44Transformer.transform(classfileBuffer);
                } catch (Throwable t) {
                    System.err.println("[ZKM-HOOK] transform failed: " + t);
                    return null;
                }
            }
        });
    }
}
