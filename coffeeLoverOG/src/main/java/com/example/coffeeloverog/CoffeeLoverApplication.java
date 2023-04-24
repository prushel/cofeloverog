package com.example.coffeeloverog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CoffeeLoverApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CoffeeLoverApplication.class.getResource("CoffeeView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Coffee Lover OG!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}