package Database;//Java SQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

    private String host = "jdbc:postgresql://katharina.camdvr.org:302/cofedb";
    private String user = null;
    private String password = null;

    private Connection conn = null;


    public boolean connect(String User, String Password)
    {

        this.user = User;
        this.password = Password;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("Connection success!");
            conn.setAutoCommit(true);


            PreparedStatement stmt =conn.prepareStatement("SELECT * FROM employee");
            ResultSet rs = stmt.executeQuery();

            while (rs.next())
            {

                System.out.println(rs.getString("first_name"));

            }

            return true;




        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass ().getName ()+": "+e.getMessage ());

            return false;
        }

    }

    public void closeConnection() throws SQLException {
        conn.close();
        System.out.println("Connection terminated");
    }
}
