package global.skymind.training.swing.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySButton extends JFrame implements ActionListener {

    //main() method to execute program
    public static void main(String[] args) {
        MySButton mySButton = new MySButton();
        mySButton.start();
    }

    //start() method to set up the features
    public void start() {

        /*
        Set up the button
        1. Instantiate button and set title as "Click me"
        2. Set button's bound
        3. Add button to components for an action
        4. Use lambda expression to print out "Hello User!"
        5. Hide text focus on button (Optional)
        6. Set up font type (Optional)

        Code at line 32
         */

        JButton button = new JButton();


        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Add button to the frame
        3. Set frame's title
        4. Set default close operation
        5. Set frame's size
        6. Set frame's layout to null

        Code at line 26
         */

        //Instantiate icon
        ImageIcon icon = new ImageIcon("src/main/resources/icon.png");
        //add icon to frame
        this.setIconImage(icon.getImage());
        //set window show up in the middle of screen
        this.setLocationRelativeTo(null);
        //set frame visibility (true)
        this.setVisible(true);

    }

    //Action performed after button was clicked
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
