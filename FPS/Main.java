import javax.swing.*;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FPS Control Loop");
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        
        frame.setVisible(true);
        
        gamePanel.startGame();
    }
}