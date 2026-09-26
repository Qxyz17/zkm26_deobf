import java.lang.reflect.*;
import java.util.*;

public class BcTest {
    public static void main(String[] args) throws Exception {
        Class<?> bc = Class.forName("com.zelix.bc");
        long a = 0; boolean foundA = false;
        for (Field f : bc.getDeclaredFields()) {
            if (f.getName().equals("a") && f.getType() == long.class) {
                f.setAccessible(true); a = f.getLong(null); foundA = true; break;
            }
        }
        System.out.println("bc.a = " + a + " (0x" + Long.toHexString(a) + "), found=" + foundA);
        Method b = null;
        for (Method m : bc.getDeclaredMethods())
            if (m.getName().equals("b") && m.getParameterCount()==3 && m.getParameterTypes()[0]==String.class && m.getParameterTypes()[1]==int.class && m.getParameterTypes()[2]==long.class) { b=m; break; }
        System.out.println("b(String,int,long): " + b);
        if (b == null) return;
        b.setAccessible(true);
        long[] tries = {
            6904371961670693747L ^ a,
            6904371961670693747L,
        };
        for (long seed : tries) {
            try {
                Object r = b.invoke(null, "m", 10390, seed);
                System.out.println("try seed=0x" + Long.toHexString(seed) + " -> [" + r + "]");
            } catch (Throwable t) {
                System.out.println("try seed=0x" + Long.toHexString(seed) + " ERR " + t.getCause());
            }
        }
    }
}
