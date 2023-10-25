package GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_06{
    public static void main(String[] args){

        JFrame frame = new JFrame("Flow Layout");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50)); // set layout manager to FlowLayout from default
        // BorderLayout manager; default alignment is  CENTER
//  add to frame
//        frame.add(new JButton("1"));
//        frame.add(new JButton("2"));
//        frame.add(new JButton("3"));
//        frame.add(new JButton("4"));
//        frame.add(new JButton("5"));
//        frame.add(new JButton("6"));
//        frame.add(new JButton("7"));
//        frame.add(new JButton("8"));
//        frame.add(new JButton("9"));
        JPanel panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setPreferredSize(new Dimension(200, 200)); // set width, height
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // although, the default man. for panel is FlowLayout

        // add to panel, then frame
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true); // ok at end
    }
}
