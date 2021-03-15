package global.skymind.solution.swing.ex1;

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
         */

        //set window's title
        this.setTitle("Basic GUI Window");
        //set exit condition to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set frame size (width 420, height 420)
        this.setSize(420, 420);
        //set frame layout (null)
        this.setLayout(null);
        //set window show up in the middle of screen
        this.setLocationRelativeTo(null);
        //set frame visibility (true)
        this.setVisible(true);
    }
}
