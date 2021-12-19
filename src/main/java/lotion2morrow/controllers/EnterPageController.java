package lotion2morrow.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EnterPageController {

    @FXML
    private Button homeBtn;

    public void onClickHome() {
        System.out.println("You've clicked the home button!");
    }
}
