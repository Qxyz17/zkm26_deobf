import java.awt.*;
import java.awt.event.InputEvent;

public class RobotClick {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        robot.setAutoDelay(300);
        // 点屏幕各处, 试着激活 ZKM 菜单
        int[][] points = {
            {100, 50}, {200, 50}, {300, 50}, {150, 80}, {400, 50},
            {100, 100}, {640, 360}, {400, 300}
        };
        for (int[] p : points) {
            robot.mouseMove(p[0], p[1]);
            robot.delay(200);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(300);
            System.out.println("clicked " + p[0] + "," + p[1]);
        }
    }
}
