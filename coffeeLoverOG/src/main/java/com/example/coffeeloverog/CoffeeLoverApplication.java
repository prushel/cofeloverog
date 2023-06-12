package com.example.coffeeloverog;

import Client.Client;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class CoffeeLoverApplication extends Application   {


    protected static Stage stage;
    protected static Scene scene;


    @Override
    public void start(Stage primaryStage) throws IOException, ClassNotFoundException, InterruptedException {

        //Login Bildschirm laden
        FXMLLoader fxmlLoader =  new FXMLLoader();
        Parent root = fxmlLoader.load(CoffeeLoverApplication.class.getResource("Login.fxml"));
        this.stage = primaryStage;
        this.scene = new Scene(root, 1200, 800);
        stage.setTitle("Coffee Lover OG!");
        /*GridPane pane_L = new GridPane();
        StackPane pane = new StackPane();
        pane.getChildren().add(pane_    L); */
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        launch();
        System.out.println("Programme launched successfully");

    }
}