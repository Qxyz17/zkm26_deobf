import org.objectweb.asm.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import java.io.*;

public class X44Dump {
    static Method x44a;
    public static void main(String[] args) throws Exception {
        String classesRoot = args[0];
        String outFile = args[1];
        Class<?> x44 = Class.forName("com.zelix.x44");
        x44a = x44.getDeclaredMethod("a", int.class, long.class);
        x44a.setAccessible(true);
        System.err.println("[X44Dump] x44.a loaded");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(outFile)));
        List<Path> classes = new ArrayList<>();
        Files.walk(Paths.get(classesRoot)).filter(p -> p.toString().endsWith(".class")).forEach(classes::add);
        int n = 0, hit = 0;
        for (Path p : classes) {
            String rel = Paths.get(classesRoot).relativize(p).toString().replace('\\', '/');
            String cn = rel.substring(0, rel.length() - 6).replace('/', '.');
            byte[] bytes = Files.readAllBytes(p);
            try {
                ClassReader cr = new ClassReader(bytes);
                final String fcn = cn;
                cr.accept(new ClassVisitor(Opcodes.ASM9) {
                    public MethodVisitor visitMethod(int access, final String name, String desc, String sig, String[] exc) {
                        return new MethodVisitor(Opcodes.ASM9) {
                            public void visitInvokeDynamicInsn(String iname, String idesc, Handle bsm, Object... bsmArgs) {
                                if (bsm.getOwner().startsWith("com/zelix/x44")) {
                                    try {
                                        Integer idx = null; Long key = null;
                                        for (Object o : bsmArgs) {
                                            if (o instanceof Integer) idx = (Integer) o;
                                            if (o instanceof Long) key = (Long) o;
                                        }
                                        if (idx != null && key != null) {
                                            String plain = (String) x44a.invoke(null, idx.intValue(), key.longValue());
                                            pw.println(fcn + "|" + name + "|" + idx + "|" + key + "|" + plain);
                                        } else {
                                            pw.println(fcn + "|" + name + "|ARGS=" + Arrays.toString(bsmArgs));
                                        }
                                    } catch (Throwable t) {
                                        pw.println(fcn + "|" + name + "|ERR " + t);
                                    }
                                }
                            }
                        };
                    }
                }, 0);
            } catch (Throwable t) {}
        }
        pw.flush(); pw.close();
        System.err.println("[X44Dump] done");
    }
}
