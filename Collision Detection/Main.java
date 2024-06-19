import javax.swing.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Box box = new Box();
        frame.add(box);
        frame.setVisible(true);

        box.startGame();
    }
}