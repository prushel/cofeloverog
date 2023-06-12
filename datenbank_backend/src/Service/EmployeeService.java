package Service;
import Models.Employee;
import Database.EmployeeDB;

public class EmployeeService
{
    public int createEmployee(Employee newEmployee)
        {
            EmployeeDB edb = new EmployeeDB();
            return edb.createEmployee()

        }

        public int fetchEmployee(int i)
        {
            return 0;
        }
    public double getEmployeeWorkingHours(int employee_id)
{

    return 0;

}








}
