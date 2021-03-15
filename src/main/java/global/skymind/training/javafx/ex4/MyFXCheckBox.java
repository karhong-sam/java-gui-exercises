package global.skymind.training.javafx.ex4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFXCheckBox extends Application implements EventHandler<ActionEvent> {

    CheckBox box1;
    CheckBox box2;
    Button button;

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
        Set up checkbox
        1. Instantiate box1, box2 as "Bacon" and "Tuna" with price respectively.
        2. Bacon $15, Tuna $10

        Code at line 38
         */
        box1 = new CheckBox();
        box2 = new CheckBox();

        /*
        Set up the button
        1. Instantiate button and title as "Order Here"
        2. Add button to the components for an action

        Code at line 47
         */
        button = new Button();


        /*
        Set up the stage
        1. Instantiate layout in VBox (vertical box) with spacing of 10
        2. Set padding for the layout (20)
        3. Add box1, box2 and button on layout
        4. Instantiate scene, add layout on scene and set Scene's dimension
        5. Set stage's title
        6. Add scene on stage

        Code at line 59
         */

        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();
    }

    int amount;
    String msg = "";
    //action performed after button was clicked
    @Override
    public void handle(ActionEvent event) {
        /*
        TODO:
        set the amount of each menu and print out the message in food ordering system
         */
        msg += "You ordered:\n";
            if (box1.isSelected()){
                amount += 15;
                msg += "Bacon\t $15 \n";
            }
            if (box2.isSelected()){
                amount += 10;
                msg += "Tuna\t\t $10 \n";
            }
            //Instantiate alert as Information Type
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            //set alert's title
            alert.setTitle("Information Dialog");
            //remove alert's header text
            alert.setHeaderText(null);
            //inset message in dialog box
            alert.setContentText(msg + "...............................\n"
                    + "Total:\t $" + amount);
            //show the dialog box and wait
            alert.showAndWait();
            //print the amount to pay on runtime
            System.out.println("You need to pay: $" + amount);
            //refresh the msg and amount
            msg = "";
            amount = 0;
    }
}
