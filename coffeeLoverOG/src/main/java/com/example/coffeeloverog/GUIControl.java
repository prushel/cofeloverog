package com.example.coffeeloverog;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class GUIControl extends CoffeeLoverApplication
{


    public static void loadNewScene(String resource) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CoffeeLoverApplication.class.getResource(resource));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
        System.out.println("View" + resource + " loaded");

    }
    public static void newWindow(String resource)
    {
        
    }


}

