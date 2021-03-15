package global.skymind.solution.swing.ex5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySMenuBar extends JFrame implements ActionListener {

    //main() method to execute program
    public static void main(String[] args) {
        MySMenuBar myMenuBar = new MySMenuBar();
        myMenuBar.start();
    }

    //start() method to set up the features
    public void start(){
	
	/*
	Set up MenuBar
	*/
        JMenuBar menuBar = new JMenuBar(); //Instantiate menuBar
        JMenu fileMenu = new JMenu("File"); //Instantiate fileMenu and set title as "File"
        JMenu editMenu = new JMenu("Edit"); //Instantiate editMenu and set title as "Edit"
        JMenu helpMenu = new JMenu("Help"); //Instantiate helpMenu and set title as "Help"

        JMenuItem loadItem = new JMenuItem("Load"); //Instantiate loadItem and set title as "Load"
        JMenuItem openItem = new JMenuItem("Open"); //Instantiate openItem and set title as "Open"
        JMenuItem saveItem = new JMenuItem("Save"); //Instantiate saveItem and set title as "Save"
        JMenuItem exitItem = new JMenuItem("Exit"); //Instantiate exitItem and set title as "Exit"

        menuBar.add(fileMenu); //add fileMenu onto menuBar
        menuBar.add(editMenu); //add editMenu onto menuBar
        menuBar.add(helpMenu); //add helpMenu onto menuBar

        fileMenu.add(openItem); //add openItem under fileMenu
        fileMenu.add(loadItem); //add loadItem under fileMenu
        fileMenu.add(saveItem); //add saveItem under fileMenu
        fileMenu.add(exitItem); //add exitItem under fileMenu

        /*
        TODO:
        1. Add openItem, loadItem, saveItem and exitItem to the components for an action event
        2. Use lambda expression to pop up message dialog for each menu item
            eg. "*You opened a file*"
        3. System.exit(0) for exitItem
         */

        openItem.addActionListener(e -> JOptionPane.showMessageDialog(this,
                                        "*You opened a file*"));
        loadItem.addActionListener(e -> JOptionPane.showMessageDialog(this,
                                        "*You loaded a file*"));
        saveItem.addActionListener(e -> JOptionPane.showMessageDialog(this,
                                        "*You saved a file*"));
        exitItem.addActionListener(e -> System.exit(0));

        /*
        Set up the frame
         */

        //add menuBar into the frame
        this.add(menuBar);
        //set window's title
        this.setTitle("Basic Menu");
        //set exit condition to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set layout to FlowLayout
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        //set frame size (width 500, height 500)
        this.setSize(500, 500);
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
