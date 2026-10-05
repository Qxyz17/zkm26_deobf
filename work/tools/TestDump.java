import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestDump {
    public static void main(String[] args) throws Exception {
        for (String name : args) {
            try {
                Class<?> c = Class.forName(name);
                System.out.println("== " + name + " initialized ==");
                for (Field f : c.getDeclaredFields()) {
                    if (f.getType() == String.class && Modifier.isStatic(f.getModifiers())) {
                        f.setAccessible(true);
                        Object v = f.get(null);
                        System.out.println("  " + f.getName() + " = " + v);
                    }
                }
            } catch (Throwable t) {
                System.out.println("!! " + name + " -> " + t);
            }
        }
    }
}
