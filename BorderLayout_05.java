package GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayout_05{
    public static void main(String[] args){
        JFrame frame = new JFrame("Layout Manager");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new BorderLayout()); // set layout manager to borderlayout; although
        // no need to do this, the default layout is BorderLayout manager
        frame.setLayout(new BorderLayout(10, 10)); // with horizontal, vertical gap from center
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.yellow);
        panel3.setBackground(Color.pink);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(100, 50)); // set dim. to panel1
        panel2.setPreferredSize(new Dimension(100, 50));
        panel3.setPreferredSize(new Dimension(100, 50));
        panel4.setPreferredSize(new Dimension(100, 50));
        panel5.setPreferredSize(new Dimension(100, 50));

        frame.add(panel1, BorderLayout.NORTH); // set panel1 to North(top) of frame
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);

        // for sub panel
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel5.setLayout(new BorderLayout(5, 5)); // panel5 will act as another container

        panel6.setBackground(new Color(150, 150, 0)); // through RGB values
        panel7.setBackground(Color.black);
        panel8.setBackground(Color.green);
        panel9.setBackground(new Color(0xFFFFBB)); // through HEX values
        panel10.setBackground(Color.cyan);

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));

        panel5.add(panel6, BorderLayout.NORTH); // set panel6 subpanel at north of panel5
        panel5.add(panel7, BorderLayout.EAST);
        panel5.add(panel8, BorderLayout.SOUTH);
        panel5.add(panel9, BorderLayout.WEST);
        panel5.add(panel10, BorderLayout.CENTER);

    }
}
