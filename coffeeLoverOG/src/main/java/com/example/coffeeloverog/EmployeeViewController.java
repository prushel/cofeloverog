package com.example.coffeeloverog;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeViewController extends ClientController implements Initializable
{
    private int employee_id;

    public EmployeeViewController(int i)
    {
        this.employee_id = i;

    }


    /*Use this constructor when you want to view a specific employee*/


    @FXML
    ImageView employee_image;
    @FXML
    DatePicker dob;
    @FXML

    DatePicker doe;
    @FXML
    TextField first_name;
    @FXML
    TextField last_name;
    @FXML
    TextField hours_week;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {



    }
}
