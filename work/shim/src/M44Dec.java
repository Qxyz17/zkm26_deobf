import java.lang.reflect.Method;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class M44Dec {
    static Cipher cipher;
    static SecretKeyFactory skf;
    static Method m44a;   // m44.a(int,long)String

    public static void init() throws Exception {
        Class<?> m44 = Class.forName("com.zelix.m44");
        for (Method m : m44.getDeclaredMethods()) {
            if (m.getName().equals("a") && m.getParameterCount() == 2
                && m.getParameterTypes()[0] == int.class && m.getParameterTypes()[1] == long.class
                && m.getReturnType() == String.class) {
                m44a = m; m44a.setAccessible(true); break;
            }
        }
        if (m44a == null) throw new RuntimeException("m44.a(int,long) not found");
        cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        skf = SecretKeyFactory.getInstance("DES");
        System.out.println("[M44Dec] init OK");
    }

    // 直接用 seed 解（不走 m44，自己算）—— 但密文数组在 m44 内部，所以还是反射调
    public static String dec(int idx, long seed) {
        try {
            return (String) m44a.invoke(null, idx, seed);
        } catch (Throwable t) {
            return null;
        }
    }

    public static void main(String[] args) throws Exception {
        init();
        // 测试已知调用：ZKM.main 里的 ZKM.b(11077, -4024) 之类
        // 先解几个看效果
        System.out.println("test(11077, -4024) = " + dec(11077, -4024));
        System.out.println("test(27953, 3596271060376456574L) = " + dec(27953, 3596271060376456574L));
    }
}
