import javax.swing.JFrame;

class GameLoop {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Box");
        Box box = new Box();
        frame.add(box);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}