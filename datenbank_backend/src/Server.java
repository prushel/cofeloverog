
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
    private static Database db;

    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //create the socket server object
        server = new ServerSocket(port);
        System.out.println("Waiting for the client request");
        //creating socket and waiting for client connection

        //keep listens indefinitely until receives 'exit' call or program terminates
        while(true){
            //read from socket to ObjectInputStream object
            Socket socket = server.accept();
            ObjectInputStream ois = null;

                    ois = new ObjectInputStream(socket.getInputStream());
                    //convert ObjectInputStream object to String
                    String[] message = (String[]) ois.readObject();
                    String[] argument = Arrays.copyOfRange(message, 1, message.length);
                    Method command = Coordinator.class.getDeclaredMethod(message[0], argument.getClass());
                    System.out.println("executing" + command);
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    Object answer = command.invoke(null, new Object[]{argument});
                    oos.writeObject(answer);
                    System.out.println("Answer to Client: " + answer.toString());
                    oos.close();

            }




            //terminate the server if client sends exit request

        }


    }


