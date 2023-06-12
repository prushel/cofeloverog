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
    private ArrayList<Schedule> schedules;

    @FXML
    private Label welcomeText;

    private MenuItem addEmployee;

    @FXML
    private SplitMenuButton locationList;
    @FXML
    private SplitMenuButton scheduleList;




    @FXML
    protected void onSelectLocation() //load all schedules
        {

        }
    @FXML
    protected EventHandler<ActionEvent> onSelectSchedule()
    {


        return null;
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }
    @FXML
    protected void newEmployee() throws IOException {
        GUIControl.showEmployeeView(1);

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
            Schedule schedule = schedules.get(i);
            men.setText("Nr: " + schedule.ID() + " " + schedule.getFrom() + " - " + schedule.getTo());
            scheduleList.getItems().add(men);
            men.setUserData(schedules.get(i)); //bind Schedule Object to Menu Item
            System.out.println("Schedule: " + schedules.get(i).ID() + " added");
        }






    }



}