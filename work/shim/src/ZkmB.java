import java.lang.reflect.Method;

public class ZkmB {
    public static void main(String[] args) throws Exception {
        Class<?> zkm = Class.forName("com.zelix.ZKM");
        long var1_1 = 0x24487063baf0L;
        // 找 b(int,long)String
        Method b = null;
        for (Method m : zkm.getDeclaredMethods())
            if (m.getName().equals("b") && m.getParameterCount()==2 && m.getParameterTypes()[0]==int.class && m.getParameterTypes()[1]==long.class && m.getReturnType()==String.class) { b=m; break; }
        if (b == null) { System.out.println("b(int,long) not found"); return; }
        b.setAccessible(true);
        System.out.println("found: " + b);
        // ZKM.main 的字符串调用 —— 直接调 ZKM.b(n, seed ^ var1_1)
        Object[][] tests = {
            {"x", 27953, 3596271060376456574L},
            {"x", 31192, 6567526310856989076L},
            {"x", 10855, 4597447638855371327L},
            {"x", 17221, 2548692315052417804L},
            {"x", 13865, 16079434320565857L},
            {"x", 31905, 829157951551642855L},
            {"x", 2763,  8312011596693170834L},
        };
        for (Object[] t : tests) {
            int n = (Integer)t[1];
            long seed = (Long)t[2] ^ var1_1;
            try {
                Object r = b.invoke(null, n, seed);
                System.out.println("b(" + n + ", ...) = [" + r + "]");
            } catch (Throwable e) {
                System.out.println("b(" + n + ", ...) ERR " + e.getCause());
            }
        }
    }
}
