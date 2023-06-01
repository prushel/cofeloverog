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
}
