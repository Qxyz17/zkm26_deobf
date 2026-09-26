import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GuiPoke {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        robot.setAutoDelay(200);
        // 找标题含 ZKM/KlassMaster 的窗口
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(500);
                    for (Window w : Window.getWindows()) {
                        if (w.isVisible() && w instanceof Frame) {
                            String title = ((Frame)w).getTitle();
                            if (title != null && (title.contains("ZKM") || title.contains("Klass"))) {
                                System.out.println("[POKE] window: " + title);
                            }
                        }
                    }
                } catch (Exception e) {}
            }
        });
        t.setDaemon(true);
        // 不实际点，只报告窗口
        Thread.sleep(2000);
        System.out.println("[POKE] done");
    }
}
