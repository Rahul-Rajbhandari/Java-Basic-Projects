import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Player extends JPanel{
    Image image;
    Player() {
        try {
            image= ImageIO.read(new File("./fighter.png"));
        } catch (Exception e) {
            System.out.println("Image loading exception " + e.getMessage());
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 300, 400,100,100, null);
    }
}
