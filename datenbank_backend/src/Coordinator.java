import Models.Employee;

import java.io.ObjectOutputStream;

public class Coordinator extends SocketServerExample
{

    protected void createEmployee()
    {
        Employee employee = new Employee();
        employee.save();

    }





}
