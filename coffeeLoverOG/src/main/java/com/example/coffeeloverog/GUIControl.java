package com.example.coffeeloverog;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIControl extends CoffeeLoverApplication
{


    public static void loadNewScene(String resource) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(CoffeeLoverApplication.class.getResource("CoffeeView.fxml"));
        scene.setRoot(root);
        System.out.println("View" + resource + " loaded");

    }
    public static void newWindow(String resource) throws IOException {

        Stage secondaryStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(CoffeeLoverApplication.class.getResource(resource));
        Scene SecondScene = new Scene(root);
        secondaryStage.setScene(SecondScene);
        secondaryStage.show();



    }
    public static void showEmployeeView(int i) throws IOException {
        Stage secondaryStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader();
        EmployeeViewController evc = new EmployeeViewController(1);
        fxmlLoader.setController(evc);
        Parent root = fxmlLoader.load(CoffeeLoverApplication.class.getResource("EmployeeView.fxml"));
        Scene SecondScene = new Scene(root);
        secondaryStage.setScene(SecondScene);
        secondaryStage.show();

    }



}

