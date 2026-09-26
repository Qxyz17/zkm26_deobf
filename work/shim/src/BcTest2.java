import java.lang.reflect.*;
import java.util.*;

public class BcTest2 {
    public static void main(String[] args) throws Exception {
        Class<?> bc = Class.forName("com.zelix.bc");
        long a = 0;
        for (Field f : bc.getDeclaredFields())
            if (f.getName().equals("a") && f.getType() == long.class) { f.setAccessible(true); a = f.getLong(null); break; }
        System.out.println("bc.a = 0x" + Long.toHexString(a));
        Method am = null;
        for (Method m : bc.getDeclaredMethods())
            if (m.getName().equals("a") && m.getParameterCount()==2 && m.getParameterTypes()[0]==int.class && m.getParameterTypes()[1]==long.class && m.getReturnType()==String.class) { am=m; break; }
        System.out.println("bc.a(int,long)String: " + am);
        if (am == null) return;
        am.setAccessible(true);
        // bc.a("b", 17687, 4835523846951461191L ^ var11_11), var11_11 = bc.a ^ 原种子(设0)
        long[] trySeeds = {
            4835523846951461191L ^ a,
            4835523846951461191L,
            4835523846951461191L ^ a ^ a,   // = 原值
        };
        for (long s : trySeeds) {
            try {
                Object r = am.invoke(null, 17687, s);
                System.out.println("seed=0x" + Long.toHexString(s) + " -> [" + r + "]");
            } catch (Throwable t) {
                System.out.println("seed=0x" + Long.toHexString(s) + " ERR " + t.getCause());
            }
        }
    }
}
