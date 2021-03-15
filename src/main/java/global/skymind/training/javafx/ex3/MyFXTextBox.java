package global.skymind.training.javafx.ex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFXTextBox extends Application implements EventHandler<ActionEvent> {

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Instantiate label and set label's title as "Write Something."
        Label label = new Label();

        //Instantiate text and set text's title as "Write here."
        TextArea text = new TextArea();

        /*
        Set up the button
        1. Instantiate button and title as "Submit"
        2. Add button to the components for an action
        3. Use lambda expression method to print input text by user
           by using getText()

        Code at line 39
         */
        Button button = new Button();

        /*
        Set up the stage
        1. Instantiate layout in VBox (vertical box)
        2. Set padding for the layout
        3. Add label, text and button on layout
        4. Instantiate scene, add layout on scene and set Scene's dimension
        5. Set stage's title
        6. Add scene on stage

        Code at line 53
         */
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();
    }

    //action performed after button was clicked
    @Override
    public void handle(ActionEvent event) {

    }
}
