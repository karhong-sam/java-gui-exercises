package global.skymind.solution.swing.ex3;

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
         */

        //Instantiate button
        button = new JButton("Submit");
        //hide text focus on button
        button.setFocusable(false);
        //add button to the components for an action event
        button.addActionListener(this);

         /*
        Set up the text box
         */

        //Instantiate textField
        textField = new JTextField();
        //Set textField's preferredSize
        textField.setPreferredSize(new Dimension(250, 40));
        //Set textField's font
        textField.setFont(new Font("Consolass", Font.BOLD, 35));
        //Set textField's foreground colour
        textField.setForeground(Color.green);
        //Set textField's background colour
        textField.setBackground(Color.BLACK);
        //Set name in the textField
        textField.setText("Username: ");

        /*
        Set up the frame
         */

        //add button into the frame
        this.add(button);
        //add textField into the frame
        this.add(textField);
        //set exit condition to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set frame layout (flow layout)
        this.setLayout(new FlowLayout());
        //pack the components within the frame
        this.pack();
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
            String msg = textField.getText();
            System.out.println("Welcome " + msg + "!");
        }
    }
}
