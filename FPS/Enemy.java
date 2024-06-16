import java.awt.*;
import java.io.File;
// import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Enemy extends JPanel {
    // Random randomNumber = new Random();
    int x = 0;
    int y = 0;
    Image image;

    Enemy() {
        try {
            image = ImageIO.read(new File("./philosophers_stone_0.png"));
        } catch (Exception e) {

        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(x, y, 100, 100);
    }

    public void update() {
        y = y + 1;
    }
}
