package GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayout_07{
    public static void main(String[] args){
        JFrame frame = new JFrame("Grid Layout");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set new Grid Layout from Border layout with param: x row, y col, hgap, vgap
        frame.setLayout(new GridLayout(3, 3, 5, 5));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.setVisible(true);
    }
}
