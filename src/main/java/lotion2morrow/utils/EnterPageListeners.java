package lotion2morrow.utils;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import lotion2morrow.Main;
import lotion2morrow.constants.Constant;

import java.io.IOException;

public interface EnterPageListeners {

    default void onClickHome() {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/Home_Page.fxml"));
                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = Constant.primaryStage;
                stage.setTitle("Home Page");
                stage.setScene(scene);

                // Ensure that the stage is maximized when the scene is displayed
                Screen screen = Screen.getPrimary();
                Rectangle2D bounds = screen.getVisualBounds();
                stage.setWidth(bounds.getWidth());
                stage.setHeight(bounds.getHeight());
                stage.setMaximized(true);

            } catch (IOException ioe) {
                System.out.println("EnterPageListeners > onClickHome");
                ioe.printStackTrace();
            }
    }
}
