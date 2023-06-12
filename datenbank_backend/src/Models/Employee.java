package Models;
import java.time.LocalDate;
import java.util.Date;

public class Employee
{

    public Employee(int employee_id, String first_name,
                    String last_name, LocalDate date_of_entry, LocalDate date_of_birth, int hours_week)
    {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.date_of_entry = date_of_entry;
        this.hours_week = hours_week;

    }
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

    public void setEmployee_id(int i)
        {
            this.employee_id = i;
        }





}
