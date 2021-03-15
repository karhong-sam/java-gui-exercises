package global.skymind.training.swing.ex1;

import javax.swing.*;

public class MySFrame extends JFrame {

    //main() method to execute program
    public static void main(String[] args) {
        MySFrame myFrame = new MySFrame();
        myFrame.start();
    }

    //start() method to set up the features
    public void start(){

        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Set frame's title
        3. Set default close operation
        4. Set frame's size
        5. Set frame's layout to null

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
}
