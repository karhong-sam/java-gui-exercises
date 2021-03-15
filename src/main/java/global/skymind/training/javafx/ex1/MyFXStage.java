package global.skymind.training.javafx.ex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyFXStage extends Application {

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {

        /*
        Set up the stage
        1. Instantiate layout in StackPane
        2. Instantiate scene, add layout on scene and set Scene's dimension
        3. Add scene on stage
        4. Set stage's title

        Code at line 29
         */
        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();
    }
}
