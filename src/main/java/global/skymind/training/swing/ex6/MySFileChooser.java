package global.skymind.training.swing.ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MySFileChooser extends JFrame implements ActionListener {

    JButton button;

    //main() method to execute program
    public static void main(String[] args) {
        MySFileChooser myFileChooser = new MySFileChooser();
        myFileChooser.start();
    }

    //start() method to set up the features
    public void start(){

        /*
        Set up the button
        1. Instantiate button and set title as "Select File"
        2. Add button to components for an action
        3. Hide text focus on button (Optional)
        4. Set up font type (Optional)

        Code at line 32
         */
        button = new JButton();


        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Set frame's layout to GridBagLayout()
        3. Add button to GridBagConstraints()
        4. Set frame's title
        5. Set default close operation
        6. Set frame's size

        Code at line 45
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
        if (e.getSource() == button){
            /*
            Setup File Chooser
            1. Instantiate fileChooser
            2. Set current directory as new File(".")
            3. Create a pop up window dialog with response in int type
                by using showOpenDialog(null)
            4. Print selected path on runtime

            Code at line 67
             */
            JFileChooser fileChooser = new JFileChooser();
            //open current path
            fileChooser.setCurrentDirectory(new File("."));
            //select file to open (replace 0 and use showOpenDialog() to create dialog box)
            int response = 0;
            //print out the selected path on runtime
            if (response == JFileChooser.APPROVE_OPTION){
                //replace null to get file path
                File file = null;
                System.out.println(file); //print out path
            }
        }
    }
}
