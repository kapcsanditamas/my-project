package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {

    private boolean clicked = false;


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        if (clicked) welcomeText.setText("**");
        else welcomeText.setText("Welcome to JavaFX Application!");

        clicked = !clicked;
    }
}
