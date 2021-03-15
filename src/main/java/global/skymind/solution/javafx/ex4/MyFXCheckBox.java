package global.skymind.solution.javafx.ex4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
         */
        //Instantiate box1, box2 as "Bacon" and "Tuna" with price respectively.
        box1 = new CheckBox("Bacon \t$15");
        box2 = new CheckBox("Tuna\t\t$10");

        /*
        Set up button
         */
        //Instantiate button and set title as "Order Here"
        button = new Button("Order Here");
        //add button to the components for an action
        button.setOnAction(this);

        /*
        Set up the stage
         */
        //Instantiate layout in VBox (vertical box) with spacing of 10
        VBox layout = new VBox(10);
        //set padding for the layout (20)
        layout.setPadding(new Insets(20));
        //add box2, box2 and button on layout
        layout.getChildren().addAll(box1, box2, button);

        //Instantiate scene, add layout on scene and set Scene's dimension (320,200)
        Scene scene = new Scene(layout, 320, 200);

        //set stage's title
        primaryStage.setTitle("Basic CheckBox");
        //add scene on stage
        primaryStage.setScene(scene);
        //add icon on stage
        primaryStage.getIcons().add(new Image("icon.png"));
        //show the stage
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
