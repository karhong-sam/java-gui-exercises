package global.skymind.training.swing.ex4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySCheckBox extends JFrame implements ActionListener {

    JLabel label;
    JButton button;
    JCheckBox pizzaBox, burgerBox, hotdogBox;

    //main() method to execute program
    public static void main(String[] args) {
        MySCheckBox checkBox = new MySCheckBox();
        checkBox.start();
    }

    //start() method to set up the features
    public void start(){

        /*
        Set up the label
        1. Instantiate label and set title as "Food Ordering System"
        2. Set label's bounds

        Code at line 31
         */

        label = new JLabel();

        /*
        Set up checkBox
        1. Instantiate pizzaBox, burgerBox, hotdogBox as "Pizza", "Burger" and "Hotdog" with price respectively.
        2. Pizza $15, Burger $10 & Hotdog $5
        3. Set bounds for each checkboxes

        Code at line 41
         */

        pizzaBox = new JCheckBox();
        burgerBox = new JCheckBox();
        hotdogBox = new JCheckBox();


        /*
        Set up the button
        1. Instantiate button and set title as "Place Order"
        2. Set button's bounds
        3. Add button to components for an action
        4. Hide text focus on button (Optional)
        5. Set up font type (Optional)

        Code at line 58
         */

        button = new JButton();

        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Add label, button and checkboxes to the frame
        3. Set frame's title
        4. Set default close operation
        5. Set frame's size
        6. Set frame's layout to null

        Code at line 70
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

    int amount;
    String msg = "";

    //Action performed after button was clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        //event is selected from checkbox

        /*
        TODO:
        set the amount of each menu and print out the message in food ordering system
         */

        if (pizzaBox.isSelected()){
            amount += 15;
            msg += "Pizza: $15\n";
        }
        if (burgerBox.isSelected()){
            amount += 10;
            msg += "Burger: $10\n";
        }
        if (hotdogBox.isSelected()){
            amount += 5;
            msg += "Hotdog: $5\n";
        }

        msg += ".........................\n";
        //pop up panel to show the message dialog
        JOptionPane.showMessageDialog(this, msg + "Total: $" + amount);
        //print the amount to pay on runtime
        System.out.println("You need to pay: $" + amount);
        //refresh the msg and amount
        msg = "";
        amount = 0;
    }
}
