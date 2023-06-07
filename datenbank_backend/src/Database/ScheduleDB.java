package Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScheduleDB extends Database
{
    public ResultSet getSchedules() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM schedule");
        ResultSet rs = stmt.executeQuery();
        return rs;
    }

    public ResultSet getScheduleShifts() throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM shift where schedule_id");
        ResultSet rs = stmt.executeQuery();

        return rs;
    }

  
}
