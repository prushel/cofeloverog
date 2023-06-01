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

public class Coordinator extends ServerMain
{

    protected ArrayList<Employee> employees = new ArrayList<>();


    protected static void getSchedule() throws IOException, SQLException, ClassNotFoundException {

        ScheduleService sc = new ScheduleService();
        ObjectOutputStream oos = new ObjectOutputStream(Server.socket.getOutputStream());
        Object answer = sc.getSchedules();
        oos.writeObject(answer);
        System.out.println("Answer to Client: " + answer);
        oos.close();


    }


    protected static void createEmployee()
    {
        Employee employee = new Employee();
       ;

    }


    protected static void Login(String[] creds) throws IOException {
        Object answer = Security.verify(creds[0], creds[1]);
        System.out.println(creds[0]);
        System.out.println(creds[1]);
        ObjectOutputStream oos = new ObjectOutputStream(Server.socket.getOutputStream());
        oos.writeObject(answer);
        System.out.println("Answer to Client: " + answer);
        oos.close();

    }




}
