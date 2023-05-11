package Models;
import Database.Database;


public class Security
{
    public static boolean verify (String Username, String Password)
    {

        Database db = new Database();

        if (db.connect(Username, Password)) {

            return true;
        }
        else {

            return false;

        }
    }


}
