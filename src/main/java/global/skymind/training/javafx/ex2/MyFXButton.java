package global.skymind.training.javafx.ex2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyFXButton extends Application implements EventHandler<ActionEvent> {

    Button button;

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {

        /*
        Set up the button
        1. Instantiate button and title as "Click me!"
        2. Set button's dimension
        3. Add button to the components for an action

        Code at line 32
         */
        button = new Button();

        /*
        Set up the stage
        1. Instantiate layout in StackPane
        2. Add button on layout
        3. Instantiate scene, add layout on scene and set Scene's dimension
        4. Set stage's title
        5. Add scene on stage

        Code at line 44
         */
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();
    }

    int count = 1;
    //Action performed after button was clicked
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button){
            //print number of button clicked by user
            System.out.println("Hello User " + count +" times");
            count++;
        }
    }
}
