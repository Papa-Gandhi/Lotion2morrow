package lotion2morrow.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lotion2morrow.utils.EnterPageListeners;

public class EnterPageController implements EnterPageListeners {

    @FXML
    private Button homeBtn;

    @Override
    public void onClickHome() {
        EnterPageListeners.super.onClickHome();
    }
}
