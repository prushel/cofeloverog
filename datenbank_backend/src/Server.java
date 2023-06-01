
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Arrays;
import Database.*;

/**
 * This class implements java Socket server
 * @author pankaj
 *
 */
public class Server {

    //static ServerSocket variable
    private static ServerSocket server;

    //socket server port on which it will listen
    private static int port = 9876;
    protected static Socket socket;

    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //create the socket server object
        server = new ServerSocket(port);
        System.out.println("Waiting for the client request");
        //creating socket and waiting for client connection

        //keep listens indefinitely until receives 'exit' call or program terminates
        String[] argument;
        String[] message;
        while (true) {
            //read from socket to ObjectInputStream object
            socket = server.accept();
            ObjectInputStream ois = null;
            ois = new ObjectInputStream(socket.getInputStream());
            //convert ObjectInputStream object to String
            message = (String[]) ois.readObject();
            argument = null;
            try {
                argument = Arrays.copyOfRange(message, 1, message.length);
                System.out.println(argument[0]);

            } catch (Exception e) {
                System.out.println("No array");
                argument = null;
            }
            finally //decide which method to execute;
            {
                if(argument == null){
                Method command = Coordinator.class.getDeclaredMethod(message[0]);
                command.invoke(null);
                }
                else{
                    Method command = Coordinator.class.getDeclaredMethod(message[0], argument.getClass());
                    command.invoke(null, new Object[]{argument});
                }
        }





    }






        }


    }


