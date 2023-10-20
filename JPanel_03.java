package GUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

public class JPanel_03{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel redPanel = new JPanel(); // create a panel
        redPanel.setBackground(Color.red); // set bg color of panel
        redPanel.setBounds(0, 0, 250, 250); // set manual pos of panel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);

        JLabel label = new JLabel();
        label.setText("HI!!");
        label.setForeground(Color.cyan);
        label.setFont(new Font("MV Boli", Font.ITALIC, 30));
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        Border border = BorderFactory.createLineBorder(Color.magenta, 2);
        label.setBorder(border);

        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
