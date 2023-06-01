package com.example.coffeeloverog;
import Models.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class CoffeeLoverController extends ClientController implements Initializable  {

    ArrayList<Location> locations;
    ArrayList<Schedule> schedules;


    @FXML
    private Label welcomeText;


    @FXML
    private SplitMenuButton locationList;

    private SplitMenuButton scheduleList;


    @FXML
    protected void onSelectLocation() //load all schedules
        {

        }
    @FXML
    protected EventHandler<ActionEvent> onSelectSchedule()
    {

        System.out.println("Something happend");



        return null;
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }




    public void initialize(URL url, ResourceBundle resourceBundle) //hier passiert was vorher geladen werden muss
    {

        try {
            clientService.getSchedules();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(("Prepreations have been made"));
        // e.g add locations and schedules to the list





    }

}