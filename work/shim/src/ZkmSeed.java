import com.zelix.prr;
import com.zelix.ZKM;
import java.lang.reflect.*;
import java.lang.invoke.MethodHandles;

public class ZkmSeed {
    public static void main(String[] args) throws Exception {
        // var1_1 = prr.a(434753564064269493L, -6059157263496536882L, lookupClass()).a(187172637952660L) ^ ZKM.a ^ 138704655075023L;
        Object fpp = null;
        Class<?> prrCls = Class.forName("com.zelix.prr");
        Method a3 = null;
        for (Method m : prrCls.getDeclaredMethods())
            if (m.getName().equals("a") && m.getParameterCount()==3 && m.getParameterTypes()[0]==long.class && m.getParameterTypes()[1]==long.class) { a3 = m; break; }
        a3.setAccessible(true);
        // 需要 ZKM.class 作为第三参
        Class<?> zkmCls = Class.forName("com.zelix.ZKM");
        fpp = a3.invoke(null, 434753564064269493L, -6059157263496536882L, zkmCls);
        Method aLong = fpp.getClass().getMethod("a", long.class);
        long part = ((Number) aLong.invoke(fpp, 187172637952660L)).longValue();
        // ZKM.a 是静态 final long
        Field af = zkmCls.getDeclaredField("a"); af.setAccessible(true);
        long za = af.getLong(null);
        long var1_1 = part ^ za ^ 138704655075023L;
        System.out.println("part     = " + part + " (0x" + Long.toHexString(part) + ")");
        System.out.println("ZKM.a    = " + za + " (0x" + Long.toHexString(za) + ")");
        System.out.println("var1_1   = " + var1_1 + " (0x" + Long.toHexString(var1_1) + ")");
    }
}
