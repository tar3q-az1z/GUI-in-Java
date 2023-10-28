package GUI;

import javax.swing.*;
import java.awt.*;

public class JLayeredPane_08{
    public static void main(String[] args){
        JFrame frame = new JFrame("Layered Pane");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // ---------------------------------
        frame.setLayout(null); // custom layout manager
        // ---------------------------------
        JLayeredPane layeredPane = new JLayeredPane(); // create layered pane
        layeredPane.setBounds(0, 0, 500, 500); // set pos with size

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        // the bigger the Integer value, the topmost it is
        layeredPane.add(label1, Integer.valueOf(2)); // add label1 to layered pane
        layeredPane.add(label2, Integer.valueOf(1));
        layeredPane.add(label3, Integer.valueOf(0));

        frame.add(layeredPane); // add layered pane to frame
        frame.setVisible(true);
    }
}
