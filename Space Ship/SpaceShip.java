import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SpaceShip extends JPanel {
    int x = 10;
    int y = 10;
    private Image spaceShipImage;

    SpaceShip() {
        super();
        try {
            spaceShipImage = ImageIO.read(new File("./ship5.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void moveLeft() {
        x = x - 10;
        repaint();
    }

    public void moveRight() {
        x = x + 10;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawImage(spaceShipImage, x, y, 100, 100, this);
        // g.fillRect(x, y, 100, 100);
    }
}
