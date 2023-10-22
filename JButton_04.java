package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// custom class 'ButtonFrame' is also a JFrame
public class JButton_04 extends JFrame implements ActionListener{
    private JButton button;
    private JLabel label;
    JButton_04(){
        // JFrame constructor[super()] is called at first implicitly if not invoked
        super("Button Window"); // same as this.setTitle()
        this.setLayout(null);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setTitle("Button Window");
        //this.getContentPane().setBackground(Color.magenta);

        button = new JButton("click me"); // created button
        button.setBounds(200, 100, 100, 30); // set position
        this.add(button); // added to frame
        button.addActionListener(this); // param: obj that implements ActionL. interface
        //button.setText("message me"); // set text to button
        button.setFocusable(false); // removes annoying border of button
//        ImageIcon icon = new ImageIcon("D:\\Java projects\\Youtube_bro\\src\\thumbs-up.png");
//        button.setIcon(icon);
//        button.setHorizontalTextPosition(JButton.CENTER);
//        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("MV Boli", Font.BOLD, 20)); // set font to button
//        button.setIconTextGap(-10);
        button.setForeground(Color.magenta); // set font color of button text
        button.setBackground(Color.darkGray); // set bg color of button
        button.setBorder(BorderFactory.createLineBorder(Color.orange)); // set border

        label = new JLabel();
        label.setText("Hi");
        label.setBounds(250, 200, 50, 50);
        label.setForeground(Color.red);
        label.setVisible(false); // set visibility of label to false
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e){  // called upon button click
        // event source is button
        if(e.getSource() == button){
            System.out.println("Clicked");
            label.setVisible(true); // set label visible now
            button.setEnabled(false); // disables the button after first click
        }
    }

    public static void main(String[] args){
        new JButton_04();
    }
}
