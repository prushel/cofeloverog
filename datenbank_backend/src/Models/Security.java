package Models;
import Database.Database;


public class Security
{

    protected boolean verify (String Username, String Password, Database db ) {

        if (db.connect(Username, Password)) {

            return true;
        }
        else {

            return false;

        }
    }


}
