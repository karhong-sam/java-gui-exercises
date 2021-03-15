package global.skymind.training.swing.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySTextField extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    //main() method to execute program
    public static void main(String[] args) {
        MySTextField myTextField = new MySTextField();
        myTextField.start();
    }

    //start() method to set up the features
    public void start(){

         /*
        Set up the button
        1. Instantiate button and set title as "Submit"
        2. Add button to components for an action
        3. Hide text focus on button (Optional)
        4. Set up font type (Optional)

        Code at line 32
         */

        button = new JButton();


         /*
        Set up the text box
        1. Instantiate textField
        2. Set textField's preferredSize
        3. Set "Username:" in the textField
        4. Set up font type (Optional)
        5. Set up textField's foreground colour (Optional)
        6. Set up textField's background colour (Optional)

        Code at line 48
         */

        textField = new JTextField();


        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Add button and textField to the frame
        3. Set frame's title
        4. Set default close operation
        5. Set frame's size
        6. Set frame's layout to flowlayout
        7. Use pack() to pack the components within frame

        Code at line 62
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
        //event get source from button
        if (e.getSource() == button){
            //Use getText() to read user's input
            String msg = null;
            System.out.println("Welcome " + msg + "!");
        }
    }
}
