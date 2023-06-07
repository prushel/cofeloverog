import Models.*;
import Service.*;
import Database.*;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 class Coordinator extends Server
{

    protected static void getSchedule() throws IOException, SQLException, ClassNotFoundException {

        ScheduleService sc = new ScheduleService();
        ArrayList<Schedule> answer = sc.getSchedules();
        Server.Answer(answer);

    }

    protected static void createEmployee()
    {
        EmployeeService es = new EmployeeService();
      
    }

    protected static void Login(String[] creds) throws IOException {
        Object answer = Security.verify(creds[0], creds[1]);
        System.out.println(creds[0]);
        System.out.println(creds[1]);
        Server.Answer(answer);

    }
    protected static void fetchScheduleShifts(Schedule scheudle)
    {
        ScheduleService sch = new ScheduleService();
        sch.getShifts(scheudle.ID());
    }





}
