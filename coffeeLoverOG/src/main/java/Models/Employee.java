package Models;
import java.time.LocalDate;
import java.util.Date;

public class Employee
{

    private int employee_id;
    private String first_name;
    private String last_name;
    private LocalDate date_of_entry;
    private LocalDate date_of_birth;

    private int hours_week;

    /*Getters*/
    public String getFirstName()
    {
        return this.first_name;
    }
    public String getLastName()
    {
        return this.last_name;
    }
    public LocalDate getDateOfBirth()
    {
        return this.date_of_birth;
    }

    public LocalDate getDateOfEntry()
    {
        return this.date_of_entry;
    }
    public int getHoursWeek()
    {
        return this.hours_week;
    }





}
