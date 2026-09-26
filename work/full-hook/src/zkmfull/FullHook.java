package zkmfull;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.io.*;
import org.objectweb.asm.*;

public class FullHook {
    static PrintWriter pw;
    public static void premain(String args, Instrumentation inst) {
        try { pw = new PrintWriter(new BufferedWriter(new FileWriter(args, false))); } catch (Exception e) {}
        System.out.println("[FULL] premain, out=" + args);
        inst.addTransformer(new ClassFileTransformer() {
            public byte[] transform(ClassLoader loader, String className, Class<?> cr, ProtectionDomain pd, byte[] cb) {
                if (className == null || !className.startsWith("com/zelix/")) return null;
                // 跳过防御相关的类
                if (className.contains("m44") || className.contains("l6k") || className.contains("OverrideGuard")
                    || className.contains("prr") || className.contains("bn")) return null;
                try {
                    ClassReader cr2 = new ClassReader(cb);
                    ClassWriter cw = new ClassWriter(cr2, ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS);
                    final String cn = className.replace('/', '.');
                    ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
                        public MethodVisitor visitMethod(int acc, String name, String desc, String sig, String[] ex) {
                            MethodVisitor mv = super.visitMethod(acc, name, desc, sig, ex);
                            if (mv != null && name.equals("a") && desc.equals("(IJ)Ljava/lang/String;")) {
                                return new MethodVisitor(Opcodes.ASM9, mv) {
                                    public void visitCode() {
                                        super.visitCode();
                                        mv.visitVarInsn(Opcodes.ILOAD, 0);
                                        mv.visitVarInsn(Opcodes.LLOAD, 1);
                                        mv.visitLdcInsn(cn);
                                        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "zkmfull/FullHook", "rec", "(IJLjava/lang/String;)V", false);
                                    }
                                    public void visitInsn(int opcode) {
                                        if (opcode == Opcodes.ARETURN) {
                                            mv.visitInsn(Opcodes.DUP);
                                            mv.visitLdcInsn(cn);
                                            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "zkmfull/FullHook", "recResult", "(Ljava/lang/String;Ljava/lang/String;)V", false);
                                        }
                                        super.visitInsn(opcode);
                                    }
                                };
                            }
                            return mv;
                        }
                    };
                    cr2.accept(cv, ClassReader.EXPAND_FRAMES);
                    return cw.toByteArray();
                } catch (Throwable e) { return null; }
            }
        });
    }
    public static synchronized void rec(int n, long l, String cls) {
        if (pw != null) pw.println("CALL|" + cls + "|" + n + "|" + l);
    }
    public static synchronized void recResult(String cls, String val) {
        if (pw != null) pw.println("RET|" + cls + "|" + val);
    }
}
