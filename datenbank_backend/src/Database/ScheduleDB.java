package Database;
import Models.Schedule;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class ScheduleDB extends Database
{
    public ArrayList<Schedule> getSchedules() throws SQLException {
        PreparedStatement stmt = Database.conn.prepareStatement("SELECT schedule_id, st_dt, ed_dt, published\n" +
                "\tFROM public.schedule;");
        ResultSet rs = stmt.executeQuery();
        ArrayList<Schedule> schedules = new ArrayList<>();

        while(rs.next()){

            Schedule s = new Schedule(rs.getInt("schedule_id"), rs.getDate("st_dt"),rs.getDate("ed_dt"));
            schedules.add(s);
        }
        return schedules;
    }

    public ResultSet getScheduleShifts() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM shift where schedule_id");
        ResultSet rs = stmt.executeQuery();

        return rs;
    }

  
}
