package Service;
import Models.Schedule;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Database.ScheduleDB;
import javax.xml.transform.Result;
public class ScheduleService
{
    public ArrayList<Schedule> getSchedules() throws IOException, ClassNotFoundException, SQLException {

        ScheduleDB sdb = new ScheduleDB();
        return sdb.getSchedules();
    }

    public void getShifts(int id)
    {

    }

}
