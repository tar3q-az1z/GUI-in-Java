package GUI;

import javax.swing.*;
import java.awt.*;

public class NewWindow_09{
    NewWindow_09(){
        JFrame frame = new JFrame("Last Window");
        frame.setSize(420, 420);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // on closing, dispose/close the only current window
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        JLabel label = new JLabel("Hi..");
        label.setBounds(0, 0, 100, 50);
        label.setForeground(Color.magenta);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        frame.add(label);
        frame.setVisible(true);
    }
}
