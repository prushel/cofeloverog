package com.example.coffeeloverog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import Client.SocketClientExample;

import java.io.IOException;
import java.net.Socket;

public class CoffeeLoverApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, ClassNotFoundException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(CoffeeLoverApplication.class.getResource("CoffeeView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Coffee Lover OG!");

        /*GridPane pane_L = new GridPane();
        StackPane pane = new StackPane();
        pane.getChildren().add(pane_L); */
        stage.setScene(scene);
        stage.show();
        System.out.println("Program started...");
        SocketClientExample client = new SocketClientExample();
        client.StartClient();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        launch();





    }
}