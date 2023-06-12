package com.example.coffeeloverog;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Models.Employee;

public class EmployeeViewController extends ClientController implements Initializable
{
    private final int employee_id;

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

    protected void getEmployee() throws IOException, ClassNotFoundException {
        String[] getEmployee =
                {
                        "getEmployee",
                        String.valueOf(this.employee_id)

                };

        Employee View = (Employee) clientService.sendMessage(getEmployee);
        this.first_name.setText(View.getFirstName());
        this.last_name.setText(View.getLastName());
        this.hours_week.setText(String.valueOf(View.getHoursWeek()));
        this.dob.setValue(View.getDateOfBirth());
        this.doe.setValue(View.getDateOfEntry());




    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        try {
            this.getEmployee();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
