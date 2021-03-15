package global.skymind.solution.javafx.ex1;

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
         */
        //Instantiate layout in StackPane
        StackPane layout = new StackPane(); //build panel onto primaryStage

        //Instantiate scene, add layout on scene and set Scene's dimension
        Scene scene = new Scene(layout, 420, 420);

        //set stage's title
        primaryStage.setTitle("Title of window");
        //add icon on stage
        primaryStage.getIcons().add(new Image("icon.png"));
        //add scene on stage
        primaryStage.setScene(scene);
        //show the stage
        primaryStage.show();
    }
}
