import javax.swing.*;
import java.awt.*;

public class Box extends JPanel implements Runnable {

    Thread thread;
    int x = 10, y = 10, a = 420, b = 10;

    Box() {
        super();
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, 100, 100);

        g.setColor(Color.BLUE);
        g.fillRect(a, b, 100, 100);
    }

    @Override
    public void run() {
        double intervalTime = 1000000000 / 60;
        double deltaTime = 0;
        long currentTime = 0;
        long lastPassedTime = System.nanoTime();

        while (thread != null) {
            currentTime = System.nanoTime();
            deltaTime += (currentTime - lastPassedTime) / intervalTime;
            lastPassedTime = currentTime;

            if (deltaTime >= 1) {
                update();
                repaint();
                deltaTime--;
            }
        }
    }

    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    public void update() {
        if (x + 100 == a) {

        } else {
            x = x + 1;
            a = a - 1;
        }
    }
}
