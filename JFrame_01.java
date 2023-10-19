package GUI;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;

public class JFrame_01{
    public static void main(String[] args){
        JFrame frame = new JFrame(); // creates a frame
        frame.setSize(420, 420); // set height and width of frame
        frame.setTitle("First GUI"); // sets title for frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app.
        frame.setVisible(true); // make frame visible
        frame.setResizable(false); // prevent frame from being resized
        ImageIcon image = new ImageIcon("D:\\Java projects\\Youtube_bro\\src\\doge.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.cyan);
    }
}
