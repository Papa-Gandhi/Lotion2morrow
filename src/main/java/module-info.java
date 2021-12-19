module Lotion2morrow {
    requires javafx.fxml;
    requires javafx.controls;
    
    opens lotion2morrow to javafx.fxml;
    exports lotion2morrow;
    opens lotion2morrow.controllers to javafx.fxml;
    exports lotion2morrow.controllers;
    exports lotion2morrow.constants;
    opens lotion2morrow.constants to javafx.fxml;
}