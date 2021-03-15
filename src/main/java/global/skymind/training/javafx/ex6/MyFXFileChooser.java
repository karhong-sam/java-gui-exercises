package global.skymind.training.javafx.ex6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class MyFXFileChooser extends Application implements EventHandler<ActionEvent> {

    FileChooser fileChooser;
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
        1. Instantiate button and title as "Select File"
        2. Set button's dimension
        3. Add button to the components for an action

        Code at line 37
         */
        button = new Button();


        /*
        Set up the stage
        1. Instantiate layout in StackPane
        2. Add button on layout
        3. Instantiate scene, add layout on scene and set Scene's dimension
        4. Set stage's title
        5. Add scene on stage

        Code at line 49
         */

        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();
    }

    //action performed after button was clicked
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button){
            /*
            Setup File Chooser
            1. Instantiate fileChooser
            2. Create a pop up window dialog with response in File type
                by using showOpenDialog(null)
            3. Print selected path on runtime

            Code at line 67
             */
            fileChooser = new FileChooser();
            //replace null in response and use showOpenDialog() to create dialog box
            File response = null;

            if (response != null){  //Do not edit this line of code
                //print out the path
                System.out.println();
            }
        }
    }
}
