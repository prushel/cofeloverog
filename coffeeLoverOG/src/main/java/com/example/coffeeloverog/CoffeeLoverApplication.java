package com.example.coffeeloverog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class CoffeeLoverApplication extends Application {


    protected static Stage stage;
    protected static Scene scene;

    protected MenuItem newEmployee;

    @Override
    public void start(Stage primaryStage) throws IOException, ClassNotFoundException, InterruptedException {

        //Login Bildschirm laden
        FXMLLoader fxmlLoader =  new FXMLLoader();
        Parent root = fxmlLoader.load(CoffeeLoverApplication.class.getResource("Login.fxml"));
        this.stage = primaryStage;
        this.scene = new Scene(root);
        stage.setTitle("Coffee Lover OG!");
        /*GridPane pane_L = new GridPane();
        StackPane pane = new StackPane();
        pane.getChildren().add(pane_L); */
        stage.setScene(scene);
        stage.setOnCloseRequest(event ->
        {
            System.out.println("Closing");
        });
        stage.show();
        System.out.println("Program started...");

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        launch();

    }
}