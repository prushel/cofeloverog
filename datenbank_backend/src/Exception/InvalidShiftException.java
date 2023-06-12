package Exception;

public class InvalidShiftException extends Exception


    // Ablauf: Coordinator tires to use service, Service throws Exception if shift is invalid,
    //Coordinator catches Exception and returns to User
{
    public InvalidShiftException(String message)
    {

    }

}
