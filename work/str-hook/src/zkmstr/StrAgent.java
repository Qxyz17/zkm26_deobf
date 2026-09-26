package zkmstr;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import java.io.*;
import org.objectweb.asm.*;

public class StrAgent {
    static PrintWriter pw;
    public static void agentmain(String args, Instrumentation inst) throws Exception {
        String outFile = (args != null && !args.isEmpty() && !args.endsWith(".jar")) ? args : "str-out.txt";
        pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile, false)));
        System.out.println("[STR] attach, out=" + outFile);
        ClassFileTransformer t = new ClassFileTransformer() {
            public byte[] transform(ClassLoader loader, String className, Class<?> cr, ProtectionDomain pd, byte[] cb) {
                if (className == null || !className.startsWith("com/zelix/")) return null;
                try {
                    ClassReader cr2 = new ClassReader(cb);
                    ClassWriter cw = new ClassWriter(cr2, ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS);
                    final String cn = className;
                    ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
                        public MethodVisitor visitMethod(int acc, String name, String desc, String sig, String[] ex) {
                            MethodVisitor mv = super.visitMethod(acc, name, desc, sig, ex);
                            if (mv != null && name.equals("a") && desc.equals("(IJ)Ljava/lang/String;")) {
                                return new MethodVisitor(Opcodes.ASM9, mv) {
                                    public void visitInsn(int opcode) {
                                        if (opcode == Opcodes.ARETURN) {
                                            mv.visitInsn(Opcodes.DUP);
                                            mv.visitLdcInsn(cn);
                                            mv.visitVarInsn(Opcodes.ILOAD, 0);
                                            mv.visitVarInsn(Opcodes.LLOAD, 1);
                                            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "zkmstr/StrAgent", "rec", "(Ljava/lang/String;Ljava/lang/String;IJ)V", false);
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
        };
        inst.addTransformer(t, true);
        for (Class<?> c : inst.getAllLoadedClasses()) { try { if (c.getName().startsWith("com.zelix.")) inst.retransformClasses(c); } catch (Throwable e) {} }
        System.out.println("[STR] retransform done");
    }
    public static synchronized void rec(String cls, String val, int n, long l) {
        if (pw != null) { pw.println(cls + "|" + n + "|" + l + "|" + val); pw.flush(); }
    }
}
