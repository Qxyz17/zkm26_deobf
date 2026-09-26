import java.lang.reflect.Method;

public class ZkmTest {
    static Method m44a;
    public static void main(String[] args) throws Exception {
        Class<?> m44 = Class.forName("com.zelix.m44");
        for (Method m : m44.getDeclaredMethods())
            if (m.getName().equals("a") && m.getParameterCount()==2 && m.getParameterTypes()[0]==int.class && m.getParameterTypes()[1]==long.class && m.getReturnType()==String.class) { m44a=m; m44a.setAccessible(true); break; }

        long var1_1 = 0x24487063baf0L;
        // ZKM.main 里的几个字符串调用
        test("x", 27953, 3596271060376456574L ^ var1_1);
        test("x", 11077, 0L ^ var1_1);   // 不完整，仅试
        test("g", 32379, 1219846864443736102L ^ var1_1);
        test("g", 27396, 2762882559493477720L ^ var1_1);
        test("g", 19167, 5372843128486737024L ^ var1_1);
        test("x", 17221, 2548692315052417804L ^ var1_1);
        test("x", 10855, 4597447638855371327L ^ var1_1);
        test("x", 31192, 6567526310856989076L ^ var1_1);
        test("x", 13865, 16079434320565857L ^ var1_1);
        test("x", 31905, 829157951551642855L ^ var1_1);
        test("x", 8036, 7054214277611192111L ^ var1_1);
        test("x", 21908, 3123322892268680655L ^ var1_1);
        test("x", 2763, 8312011596693170834L ^ var1_1);
    }
    static void test(String tag, int idx, long seed) {
        try {
            Object r = m44a.invoke(null, idx, seed);
            System.out.println("[" + tag + " " + idx + "] = " + r);
        } catch (Throwable t) { System.out.println("[" + tag + " " + idx + "] ERR " + t.getCause()); }
    }
}
