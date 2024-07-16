package com.example.gamebeta;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnStart;

    @FXML
    private Button btnExit;

    @FXML
    private Label label;

    @FXML
    private Label label2;

    @FXML
    void onbtnStart(ActionEvent event) {
        label2.setVisible(true);
        label.setVisible(false);
        btnStart.setVisible(false);
        btnExit.setVisible(false);
    }

    @FXML
    void onbtnExit(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void initialize() {

    }

}
