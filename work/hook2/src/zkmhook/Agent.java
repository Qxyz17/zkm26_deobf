package zkmhook;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.lang.reflect.Method;
import java.util.*;

public class Agent {
    static boolean installed = false;

    public static void premain(String args, Instrumentation inst) {
        install(inst);
    }

    public static void agentmain(String args, Instrumentation inst) {
        install(inst);
    }

    static synchronized void install(Instrumentation inst) {
        if (installed) return;
        installed = true;
        System.err.println("[ZKM-HOOK] installing");
        // 1) 注册 transformer，拦截未来加载的 m44
        inst.addTransformer(new ClassFileTransformer() {
            public byte[] transform(ClassLoader loader, String className, Class<?> cbr,
                                    ProtectionDomain pd, byte[] buf) {
                if (className == null || !className.equals("com/zelix/m44")) return null;
                System.err.println("[ZKM-HOOK] intercepting m44 (" + buf.length + " bytes)");
                try { return M44Hook.transform(buf); } catch (Throwable t) { return null; }
            }
        }, true);  // canRetransform
        // 2) retransform 已加载的 m44
        try {
            for (Class<?> c : inst.getAllLoadedClasses()) {
                if (c.getName().equals("com.zelix.m44")) {
                    System.err.println("[ZKM-HOOK] retransforming loaded m44");
                    inst.retransformClasses(c);
                }
            }
        } catch (Throwable t) {
            System.err.println("[ZKM-HOOK] retransform err: " + t);
        }
    }
}
