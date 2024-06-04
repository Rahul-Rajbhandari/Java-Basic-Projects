import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
        frame.setVisible(true);
        JButton button1 = new JButton("Button1");
        frame.add(button1);

        JButton button2 = new JButton("Button2");
        frame.add(button2);

        JButton button3 = new JButton("Button3");
        frame.add(button3);

        JButton button4 = new JButton("Button4");
        frame.add(button4);

    }
}