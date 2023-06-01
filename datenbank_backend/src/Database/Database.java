package Database;//Java SQL
import org.postgresql.util.PSQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

    private String host = "jdbc:postgresql://katharina.camdvr.org:302/cofedb";
    private static String user = null;
    private static String password = null;

    public static Connection conn = null;


    public boolean connect(String User, String Password)
    {

        this.user = User;
        this.password = Password;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("Connection success!");
            conn.setAutoCommit(true);
            return true;
        } catch (PSQLException e) {

            return false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void closeConnection() throws SQLException {
        conn.close();
        System.out.println("Connection terminated");
    }
}
