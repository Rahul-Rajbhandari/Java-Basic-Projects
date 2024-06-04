import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Box extends JPanel {
    private Rectangle[] boxes = new Rectangle[100];
    Random random = new Random();

    Box() {
        super();

        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new Rectangle();
            // boxes[i].x = i * 50;
            // boxes[i].y = 10;
        }

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);

        for (int i = 0; i < boxes.length; i++) {
            // g.fillRect(boxes[i].x, boxes[i].y, 20, 20);
            g.fillRect(random.nextInt(500), random.nextInt(500), 20, 20);
        }

        // g.fillRect(10, 10, 100, 100);
        // g.drawRect(120, 10, 100, 100);
        // g.fillOval(10, 200, 100, 100);
        // g.fill3DRect(200, 200, 100, 100, true);
        // g.fillRoundRect(PROPERTIES, HEIGHT, FRAMEBITS, ERROR, ALLBITS, ABORT);

    }

}
