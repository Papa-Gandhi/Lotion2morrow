module Lotion2morrow {
    requires javafx.fxml;
    requires javafx.graphics;

    opens lotion2morrow to javafx.fxml;
    exports lotion2morrow;
    opens lotion2morrow.controllers to javafx.fxml;
    exports lotion2morrow.controllers;
//    exports com.example.airlinereservationsystem.model;
//    opens com.example.airlinereservationsystem.model to javafx.fxml;
//    exports com.example.airlinereservationsystem.utils;
//    opens com.example.airlinereservationsystem.utils to javafx.fxml;
    exports lotion2morrow.constants;
    opens lotion2morrow.constants to javafx.fxml;
//    exports com.example.airlinereservationsystem.controllers;
//    opens com.example.airlinereservationsystem.controllers to javafx.fxml;
}