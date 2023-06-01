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



    @FXML
    private Label welcomeText;


    @FXML
    private SplitMenuButton locationList;
    @FXML
    private SplitMenuButton scheduleList;

    private ArrayList<Schedule> schedules;


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


        System.out.println(("Prepreations have been made"));
        try {
            this.schedules = clientService.getSchedules();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0;i<schedules.size();i++){
            MenuItem men = new MenuItem();
            men.setText("1");
            scheduleList.getItems().add(men);
        }




    }

}