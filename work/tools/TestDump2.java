import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestDump2 {
    public static void main(String[] args) throws Exception {
        for (String name : args) {
            try {
                Class<?> c = Class.forName(name);
                System.out.println("== " + name + " ==");
                for (Field f : c.getDeclaredFields()) {
                    if (!Modifier.isStatic(f.getModifiers())) continue;
                    f.setAccessible(true);
                    if (f.getType() == String.class) {
                        Object v = f.get(null);
                        if (v != null) System.out.println("  " + f.getName() + " = " + v);
                    } else if (f.getType() == String[].class) {
                        Object v = f.get(null);
                        if (v != null) {
                            String[] arr = (String[]) v;
                            for (int i = 0; i < arr.length; i++) {
                                if (arr[i] != null && !arr[i].isEmpty()) System.out.println("  " + f.getName() + "[" + i + "] = " + arr[i]);
                            }
                        }
                    }
                }
            } catch (Throwable t) {
                System.out.println("!! " + name + " -> " + t);
            }
        }
    }
}
