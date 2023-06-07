package com.example.coffeeloverog;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class NewEmployeeController extends ClientController
{
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

    @FXML
    protected void createEmployee() throws IOException, ClassNotFoundException {
            String[] i = new String[]{"createEmployee", this.first_name.getText(), this.last_name.getText(), String.valueOf(this.dob),
                    String.valueOf(this.doe), this.hours_week.getText()};



            if((int) clientService.sendMessage(i) == 1){
                GUIControl.showEmployeeView(1);
            }

        }
}
