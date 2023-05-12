import Models.*;
import Database.*;

import java.util.ArrayList;
import java.util.List;

public class Coordinator extends Server
{

    protected ArrayList<Employee> employees = new ArrayList<>();


    protected void createEmployee()
    {
        Employee employee = new Employee();
        employee.save();

    }


    protected boolean Login(String[] creds)
    {
        return Security.verify(creds[0], creds[1]);

    }





}
