import Models.*;
import Database.*;

import java.util.ArrayList;
import java.util.List;

public class Coordinator extends Server
{

    protected ArrayList<Employee> employees = new ArrayList<>();


    protected static void createEmployee()
    {
        Employee employee = new Employee();
       ;

    }


    protected static boolean Login(String[] creds)
    {
        return Security.verify(creds[0], creds[1]);


    }





}
