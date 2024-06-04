import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("SpaceShip");
        frame.setSize(500, 500);
        frame.setVisible(true);

        SpaceShip spaceShip = new SpaceShip();
        spaceShip.setPreferredSize(new Dimension(500, 300));
        frame.add(spaceShip, BorderLayout.NORTH);

        JButton left = new JButton("Left");
        JButton right = new JButton("Right");
        JPanel actionPanel = new JPanel();
        actionPanel.add(left);
        actionPanel.add(right);

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                spaceShip.moveLeft();
            }
        });
        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                spaceShip.moveRight();
            }
        });

        frame.add(actionPanel, BorderLayout.SOUTH);

        
    }
}