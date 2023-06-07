
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.util.Arrays;
import Database.Database;

/**
 * This class implements java Socket server
 * @author pankaj
 *
 */
public class Server {

    //static ServerSocket variable
    private static ServerSocket server = null;
    //socket server port on which it will listen
    private static int port = 9876;
    private static Socket socket; //ClientSocket

    public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //create the socket server object

        server = new ServerSocket(port);
        System.out.println("Waiting for the client request");
        //creating socket and waiting for client connection

        //keep listens indefinitely until receives 'exit' call or program terminates

        while (true) {
            //read from socket to ObjectInputStream object
            System.out.println("back");
            socket = server.accept();
            System.out.println("Connection accepted from: "+  socket.getInetAddress());
            try {
                TranslateMessage();
            }catch(SocketException e) //Catch Client disconnecting and close Socket;
            {
                System.out.println("Connectioin to Client lost");
                socket.shutdownInput();
                socket.shutdownOutput();
                socket.close();
                socket = null;

            }



        }
    }

        protected static void Answer(Object answer) throws IOException {
            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            os.writeObject(answer);
            System.out.println("Answer to Client " + answer);

        }
        protected static void TranslateMessage() throws IOException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        String[] argument;
        String[] message;
        ObjectInputStream ois = null;
        ois = new ObjectInputStream(socket.getInputStream());
        //convert ObjectInputStream object to String
        message = (String[]) ois.readObject();
        System.out.println("Client sent: " + message);
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


