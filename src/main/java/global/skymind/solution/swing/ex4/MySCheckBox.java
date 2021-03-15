package global.skymind.solution.swing.ex4;

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
        Set up the button
         */

        //Instantiate label
        label = new JLabel("Food Ordering System");
        label.setBounds(100, 50, 300, 20);

        //Instantiate each item and set the bounds (pizzaBox, burgerBox & hotdogBox)
        pizzaBox = new JCheckBox("Pizza ($15)");
        pizzaBox.setBounds(100, 100, 150, 20);
        burgerBox = new JCheckBox("Burger ($10)");
        burgerBox.setBounds(100, 150, 150, 20);
        hotdogBox = new JCheckBox("Hotdog ($5)");
        hotdogBox.setBounds(100, 200, 150, 20);

        /*
        Set up the button
         */

        //Instantiate button
        button = new JButton("Place Order");
        button.setBounds(100, 250, 120, 30);
        //add button to the components for an action event
        button.addActionListener(this);

        /*
        Set up the frame
         */

        //add label into the frame
        this.add(label);
        //add button into the frame
        this.add(button);
        //add checkbox items into the frame (burgerBox, pizzaBox & hotdogBox)
        this.add(burgerBox);
        this.add(pizzaBox);
        this.add(hotdogBox);
        //set window's title
        this.setTitle("Food Order Application");
        //set exit condition to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set frame size (width 400, height 400)
        this.setSize(400, 400);
        //set frame layout (null)
        this.setLayout(null);
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
