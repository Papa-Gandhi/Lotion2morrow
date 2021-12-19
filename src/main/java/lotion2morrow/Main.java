package lotion2morrow;

import lotion2morrow.constants.Constant;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            // Loading the fxml
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/Enter_Page.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            // Pass the stage instance to constant
            Constant.primaryStage = primaryStage;

            // Displaying the scene
            primaryStage.setTitle("Enter Page");
            primaryStage.setScene(scene);
            primaryStage.setMaximized(true);
            primaryStage.show();

        } catch (IOException ioe) {
            System.out.println("lotion2morrow.Main > start");
            ioe.printStackTrace();
        }
    }
}
