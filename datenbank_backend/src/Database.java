//Java SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;
public class Database {

    private String host = "jdbc:postgresql://10.20.129.83:5432/cofedb";
    private String user = "cofeadmin";
    private String password = "cofe";

    private Connection conn = null;

    public void connect()
    {

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("Success!");
            conn.setAutoCommit(true);


            PreparedStatement stmt =conn.prepareStatement("SELECT * FROM employee");
            ResultSet rs = stmt.executeQuery();

            while (rs.next())
            {

                System.out.println(rs.getInt("employee_id"));

            }




        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass ().getName ()+": "+e.getMessage ());
        }
    }

    public void closeConnection() throws SQLException {
        conn.close();
    }
}
