package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Date.*;

public class EmployeeDB extends Database
{
/* creates and employee and returnd the id*/
    public int createEmployee(String firstName, String lastName, LocalDate date_of_birth, LocalDate date_of_entry) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement("INSERT INTO public.employee(" +
                 "first_name, last_name, date_of_birth, date_of_entry)" +
                 "first_name, last_name, date_of_birth, date_of_entry)" +
                "VALUES (?, ?, ?, ?, ?);");
        Date dob = Date.from(Instant.from(date_of_birth)); //convert local date to java.util.date
        Date doe = Date.from(Instant.from(date_of_entry));
        ps.setString(1, firstName);
        ps.setString(2, lastName);
        ps.setDate(3, (java.sql.Date) dob);
        ps.setDate(4, (java.sql.Date) doe);
        ResultSet rs = ps.executeQuery();
        int inserted_employee_id = rs.getInt("employee_id");
        return inserted_employee_id;
    }



}
