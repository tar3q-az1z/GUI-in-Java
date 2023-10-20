package GUI;

import javax.swing.*;
import java.awt.*;

public class JLabel_02{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(); // create a label
        frame.add(label); // add component to frame
        label.setText("Dogeeee"); // set label text
        ImageIcon image = new ImageIcon("D:\\Java projects\\Youtube_bro\\src\\doge.jpg");
        label.setIcon(image); // set icon for label
        label.setHorizontalTextPosition(JLabel.CENTER); // set label text to center of icon
        label.setVerticalTextPosition(JLabel.BOTTOM); // set label text to bottom of icon
        label.setForeground(Color.magenta); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        label.setIconTextGap(0); // set gap of text to image
        label.setBackground(Color.black); // set bg color of label
        label.setOpaque(true); // display bg color
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text withing label
        label.setHorizontalAlignment(JLabel.CENTER); // same for horizontal pos
        frame.setLayout(null);
        label.setBounds(100, 100, 350, 350);

    }
}
