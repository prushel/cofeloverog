package com.example.coffeeloverog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class viewShiftController {

    @FXML
    private DatePicker dtShiftDate;

    @FXML
    private AnchorPane apShiftAnchorPane;

    @FXML
    private TextField day;

    @FXML
    private TextField month;

    public void show(ActionEvent actionEvent){
        LocalDate localDate = dtShiftDate.getValue();

        String dayName = localDate.getDayOfWeek().toString();
        String monthName = localDate.getMonth().toString();

        day.setText(dayName);
        month.setText(monthName);

    }
}
