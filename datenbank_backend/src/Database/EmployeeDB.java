package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class EmployeeDB extends Database
{

    public int createEmployee(String firstName, String lastName, Date date_of_birth, Date date_of_entry) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement("INSERT INTO public.employee(" +
                 "first_name, last_name, date_of_birth, date_of_entry)" +
                 "first_name, last_name, date_of_birth, date_of_entry)" +
                "VALUES (?, ?, ?, ?, ?);");
        ps.setString(1, firstName);
        ps.setString(2, lastName);
        ps.setDate(3, (java.sql.Date) date_of_birth);
        ps.setDate(4, (java.sql.Date) date_of_entry);




        return 0;
    }


}
