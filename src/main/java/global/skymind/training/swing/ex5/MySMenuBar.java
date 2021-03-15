package global.skymind.training.swing.ex5;

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
        1. Instantiate menuBar, fileMenu, editMenu and helpMenu
        2. Instantiate loadItem, openItem,saveItem and exitItem
        3. Add the menus and menuItems on menuBar
        4. Add menuItems under fileMenu

        Code at line 31
         */

        JMenuBar menuBar = new JMenuBar(); //Instantiate menuBar
        JMenu fileMenu = new JMenu("File"); //Instantiate fileMenu and set title as "File"


        JMenuItem loadItem = new JMenuItem("Load"); //Instantiate loadItem and set title as "Load"


        menuBar.add(fileMenu); //add fileMenu onto menuBar



        fileMenu.add(loadItem); //add loadItem under fileMenu


        /*
        TODO:
        1. Add openItem, loadItem, saveItem and exitItem to the components for an action event
        2. Use lambda expression and JOptionPane to pop up message dialog for each menu item
           eg. "*You opened a file*"
        3. System.exit(0) for exitItem

        Code at line 54
         */
        loadItem.addActionListener(e -> JOptionPane.showMessageDialog(this,
                                        "*You loaded a file*"));
        //openItem

        //saveItem

        //exitItem


        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Add menuBar to the frame
        3. Set frame's title
        4. Set default close operation
        5. Set frame's size
        6. Set frame's layout to flowlayout(LEFT)

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

    //Action performed after button was clicked
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
