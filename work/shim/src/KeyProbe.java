import com.zelix.prr;
import com.zelix.fpp;
import java.lang.reflect.Method;

public class KeyProbe {
    public static void main(String[] args) throws Exception {
        long seed1 = -8455089274228520502L;
        long seed2 = -3019465799095495167L;
        long seed3 = 79544669071401L;
        long xorv  = 135910015983953L;

        System.out.println("[probe] loading prr...");
        Class<?> prrCls = Class.forName("com.zelix.prr");
        System.out.println("[probe] prr loaded: " + prrCls);

        // 调 prr.a(long, long, Object)
        Method a3 = null;
        for (Method mth : prrCls.getDeclaredMethods()) {
            if (mth.getName().equals("a") && mth.getParameterCount() == 3) {
                Class<?>[] p = mth.getParameterTypes();
                if (p[0] == long.class && p[1] == long.class) {
                    a3 = mth;
                    System.out.println("[probe] found prr.a(long,long,Object): " + mth);
                    break;
                }
            }
        }
        if (a3 == null) { System.out.println("[probe] a(long,long,Object) NOT FOUND"); return; }
        a3.setAccessible(true);

        System.out.println("[probe] invoking prr.a(" + seed1 + ", " + seed2 + ", null)...");
        Object fppObj = a3.invoke(null, seed1, seed2, null);
        System.out.println("[probe] got fpp: " + fppObj + " class=" + (fppObj == null ? "null" : fppObj.getClass().getName()));

        if (fppObj == null) { System.out.println("[probe] null fpp, abort"); return; }

        // 调 fpp.a(long) -> long
        Method aLong = fppObj.getClass().getMethod("a", long.class);
        System.out.println("[probe] found fpp.a(long): " + aLong);
        Object val = aLong.invoke(fppObj, seed3);
        System.out.println("[probe] fpp.a(" + seed3 + ") = " + val);

        long raw = ((Number) val).longValue();
        long key = raw ^ xorv;
        System.out.println("[probe] RAW  = " + raw + " (0x" + Long.toHexString(raw) + ")");
        System.out.println("[probe] KEY  = " + key + " (0x" + Long.toHexString(key) + ")");

        byte[] keyBytes = new byte[8];
        for (int i = 0; i < 8; i++) {
            keyBytes[i] = (byte)(key >>> (56 - i * 8));
        }
        System.out.print("[probe] KEY bytes: ");
        for (byte b : keyBytes) System.out.print(String.format("%02X ", b));
        System.out.println();
    }
}
