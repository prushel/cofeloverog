
import java.io.*;
import java.lang.ClassNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Scanner;

import Database.*;

/**
 * This class implements java Socket server
 * @author pankaj
 *
 */
public class ServerMain {

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
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String Input = ois.readObject().toString();
            int index = Input.indexOf("(");

            System.out.println(index);
            String MethodName = Input.substring(0, index);






;

        }




        //terminate the server if client sends exit request

    }


}


