import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    Thread thread;
    Enemy[] enemy= new Enemy[5];
    Player player = new Player();
    
    GamePanel() {
        super();
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.BLACK);
        for(int i=0; i<enemy.length;i++){
            enemy[i] = new Enemy();
        }
        
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i=0; i<enemy.length;i++){
            enemy[i].paintComponent(g);
        }
    }
    @Override
    public void run() {
        double drawInterval = 1000000000 / 60;  // (1second/60) which means 60 frame per second
        double deltaTime = 0;
        long lastPassedTime = System.nanoTime();
        long currentTime = 0;

        while (thread != null) {
            currentTime = System.nanoTime();
            deltaTime += (currentTime - lastPassedTime) / drawInterval;
            lastPassedTime = currentTime;

            System.out.println(currentTime);
            if (deltaTime >= 1) {
                update();
                repaint();
                deltaTime--;
            }
        }
    }
    public void startGame() {
        thread = new Thread(this);
        thread.start();
    }

    public void update() {
        for(int i=0; i<enemy.length;i++){
            enemy[i].update();
        }
    }

}
