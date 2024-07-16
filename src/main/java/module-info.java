module com.example.gamebeta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gamebeta to javafx.fxml;
    exports com.example.gamebeta;
}