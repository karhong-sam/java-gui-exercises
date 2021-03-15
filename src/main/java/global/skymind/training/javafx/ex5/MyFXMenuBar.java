package global.skymind.training.javafx.ex5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyFXMenuBar extends Application implements EventHandler<ActionEvent> {

    //Instantiate alert as Information Type
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {

        /*
        Set up MenuBar
        1. Instantiate menuBar, fileMenu, editMenu and helpMenu
        2. Instantiate newItem, openItem,saveItem and exitItem
        3. Add the menus and menuItems on menuBar
        4. Add menuItems under fileMenu

        Code at line 40
         */
        MenuBar menuBar = new MenuBar(); //Instantiate menuBar
        Menu fileMenu = new Menu("File");   //Instantiate fileMenu and set title as "File"


        MenuItem newItem = new MenuItem("New");     //Instantiate newItem and set title as "New"


        /*
        TODO:
        1. Add openItem, loadItem, saveItem and exitItem to the components for an action event
        2. Use lambda expression and alert to pop up message dialog for each menu item
            eg. "*You opened a file*"
        3. System.exit(0) for exitItem
         */

        newItem.setOnAction(e -> {
            alert.setHeaderText(null);
            alert.setContentText("*You created a new file*");
            alert.showAndWait();}
        );
        //openItem

        //saveItem

        //exitItem

        /*
        Set up the stage
        1. Instantiate layout in BorderPane
        2. Set padding for the layout (20)
        3. Add menuBar on top of layout
        4. Instantiate scene, add layout on scene and set Scene's dimension
        5. Set stage's title
        6. Add scene on stage

        Code at line 59
         */

        primaryStage.getIcons().add(new Image("icon.png"));
        primaryStage.show();
    }

    //action performed after button was clicked
    @Override
    public void handle(ActionEvent event) {

    }
}
