import java.awt.*;
// import java.awt.image.ImageObserver;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Enemy extends JPanel{
    Random randomNumber = new Random();
    int x = randomNumber.nextInt(400);
    int y = 0;
    int y1 = -500;
    Image image;

    Enemy() {
        try {
            image = ImageIO.read(new File("./Asteroid Brown.png"));
        } catch (Exception e) {
            System.out.println("Image loading exception: " + e.getMessage());
        }
    }

    public void paintComponent(Graphics g) {
        if (image != null){
            g.drawImage(image, x, y, 40, 40,null);
        }
        else{
            // g.setColor(Color.CYAN);
            // g.fillRect(x, y, 100, 100);
        }

    }

    public void update() {
        if (y==500){
            x = randomNumber.nextInt(400);
            y=0;
        }
        y = y + 1;

    }
}
