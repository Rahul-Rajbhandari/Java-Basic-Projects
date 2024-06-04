import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    Thread thread;
    int x;
    int y;

    GamePanel() {
        super();
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x, y, 100, 100);

    }

    @Override
    public void run() {
        double drawInterval = 1000000000 / 60;
        double deltaTime = 0;
        long lastPassedTime = System.nanoTime();
        long currentTime = 0;

        while (thread != null) {
            currentTime = System.nanoTime();
            deltaTime += (currentTime - lastPassedTime) / drawInterval;
            System.out.println(deltaTime);
            lastPassedTime = currentTime;

            if (deltaTime >= 1) {
                x = x + 4;
                repaint();
                deltaTime--;
            }

            // long time = System.nanoTime();
            // System.out.println("Game Loop" + time);
            // x++;
        }
    }

    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    public void update() {

    }
}
