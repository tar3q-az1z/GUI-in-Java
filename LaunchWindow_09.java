package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchWindow_09 implements ActionListener{
    private JFrame frame = new JFrame("Lanucher");
    private JButton button = new JButton("new window");
    LaunchWindow_09(){
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // required for using setBounds() method

        button.setFocusable(false);
        button.setForeground(Color.GREEN);
        button.setBackground(Color.BLUE);
        button.setBorder(BorderFactory.createLineBorder(Color.RED));
        button.addActionListener(this);
        button.setBounds(100, 160, 200, 40);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);

        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            frame.dispose(); // dispose/close the current window/frame
            new NewWindow_09();
        }
    }

    public static void main(String[] args){
        new LaunchWindow_09();
    }
}
