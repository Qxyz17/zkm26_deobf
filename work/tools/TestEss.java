import java.lang.reflect.Method;

public class TestEss {
    public static void main(String[] args) throws Exception {
        try {
            Class<?> ess = Class.forName("com.zelix.ess");
            System.out.println("ess loaded: " + ess);
            Method m = ess.getMethod("a", long.class, long.class, Object.class);
            Object b44 = m.invoke(null, -844179677517071031L, -313397354718704507L, (Object)null);
            System.out.println("b44: " + b44);
            Method al = b44.getClass().getMethod("a", long.class);
            Object key = al.invoke(b44, 212284683528426L);
            System.out.println("key: " + key);
            long k = ((Number)key).longValue();
            System.out.println("key hex: " + Long.toHexString(k));
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
