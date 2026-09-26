package zkmkey;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.ClassFileTransformer;
import java.security.ProtectionDomain;
import org.objectweb.asm.*;

public class KeyAgent {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("[KEY-HOOK] attached");
        inst.addTransformer(new ClassFileTransformer() {
            public byte[] transform(ClassLoader loader, String className, Class<?> cr, ProtectionDomain pd, byte[] cb) {
                if (className == null) return null;
                if (!className.equals("com/sun/crypto/provider/DESCipher")) return null;
                try {
                    ClassReader cr2 = new ClassReader(cb);
                    ClassWriter cw = new ClassWriter(cr2, ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
                    ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
                        public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] ex) {
                            MethodVisitor mv = super.visitMethod(access, name, desc, sig, ex);
                            if (mv == null) return null;
                            if (name.equals("engineDoFinal") && desc.equals("([BII)[B")) {
                                System.out.println("[KEY-HOOK] HOOK engineDoFinal([BII)[B");
                                return new MethodVisitor(Opcodes.ASM9, mv) {
                                    public void visitCode() {
                                        super.visitCode();
                                        // 打印 in, inOff, inLen 及前 8 字节
                                        mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
                                        mv.visitTypeInsn(Opcodes.NEW, "java/lang/StringBuilder");
                                        mv.visitInsn(Opcodes.DUP);
                                        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
                                        mv.visitLdcInsn("[SPI-IN] off=");
                                        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                                        mv.visitVarInsn(Opcodes.ILOAD, 2);
                                        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
                                        mv.visitLdcInsn(" len=");
                                        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                                        mv.visitVarInsn(Opcodes.ILOAD, 3);
                                        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
                                        mv.visitLdcInsn(" first8=");
                                        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                                        // 手动打印前8字节
                                        for (int k = 0; k < 8; k++) {
                                            mv.visitVarInsn(Opcodes.ALOAD, 1);
                                            mv.visitVarInsn(Opcodes.ILOAD, 2);
                                            mv.visitInsn(Opcodes.IADD);
                                            mv.visitInsn(Opcodes.ICONST_0 + k);
                                            mv.visitInsn(Opcodes.IADD);
                                            mv.visitInsn(Opcodes.BALOAD);
                                            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "toHexString", "(I)Ljava/lang/String;", false);
                                            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                                            mv.visitLdcInsn(" ");
                                            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                                        }
                                        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
                                        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false);
                                    }
                                };
                            }
                            return mv;
                        }
                    };
                    cr2.accept(cv, ClassReader.EXPAND_FRAMES);
                    return cw.toByteArray();
                } catch (Throwable t) { System.out.println("[KEY-HOOK] fail: " + t); return null; }
            }
        });
    }
}
