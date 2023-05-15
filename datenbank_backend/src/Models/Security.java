package Models;
import Database.Database;


public class Security
{
    public static boolean verify (String Username, String Password)
    {

        Database db = new Database();
        return db.connect(Username, Password);


    }


}
