package com.example.coffeeloverog;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CoffeeLoverController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}