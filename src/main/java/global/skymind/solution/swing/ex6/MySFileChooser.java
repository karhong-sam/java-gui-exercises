package global.skymind.solution.swing.ex6;

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
         */

        //Instantiate button and set title to "Select File"
        button = new JButton("Select File");
        //add button to the components for an action event
        button.addActionListener(this);
        //hide text focus on button
        button.setFocusable(false);

        /*
        Set up the frame
         */

        //set layout to GridBagLayout()
        this.setLayout(new GridBagLayout());
        //add button to GridBagConstraints()
        this.add(button, new GridBagConstraints()); //automatically align to middle
        //set window's title
        this.setTitle("File Chooser");
        //set frame size (width 320, height 125)
        this.setSize(320, 125);
        //set exit condition to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set window show up in the middle of screen
        this.setLocationRelativeTo(null);
        //set frame visibility (true)
        this.setVisible(true);
    }

    //Action performed after button was clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){

            JFileChooser fileChooser = new JFileChooser();
            //open current path
            fileChooser.setCurrentDirectory(new File("."));
            //select file to open
            int response = fileChooser.showOpenDialog(null);
            //print out the selected path on runtime
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file); //print out path
            }
        }
    }
}
