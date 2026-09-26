package zkmread;
import java.lang.instrument.Instrumentation;
import java.lang.reflect.Field;

public class ReadAgent {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("[READ] attached");
        // 延迟 5 秒后读 l6k 静态字段
        Thread t = new Thread(new Runnable() {
            public void run() {
                try { Thread.sleep(5000); } catch (Exception e) {}
                try {
                    Class<?> c = Class.forName("com.zelix.l6k");
                    System.out.println("[READ] l6k loaded: " + c);
                    for (String fn : new String[]{"M", "m", "H", "C"}) {
                        try {
                            Field f = c.getDeclaredField(fn);
                            f.setAccessible(true);
                            Object v = f.get(null);
                            System.out.println("[READ] l6k." + fn + " = [" + v + "]");
                        } catch (Throwable e) {
                            System.out.println("[READ] l6k." + fn + " 读取失败: " + e);
                        }
                    }
                } catch (Throwable e) {
                    System.out.println("[READ] 加载 l6k 失败: " + e);
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }
}
