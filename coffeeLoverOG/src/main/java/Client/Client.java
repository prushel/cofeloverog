package Client;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * This class implements java socket client
 * @author pankaj
 *
 */
public class Client {

    public  Socket socket1 = null;

    public void StartClient() throws IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        for(int i=0; i<5;i++){
            //establish socket connection to server


            this.socket1 = new Socket(host.getHostName(), 9876);
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket1.getOutputStream());
            System.out.println("Sending request to Socket Server");
            if(i==4)oos.writeObject("exit");
            else oos.writeObject(""+i);
            //read the server response message
            ois = new ObjectInputStream(socket1.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            //close resources
            ois.close();
            oos.close();
            Thread.sleep(100);
        }





    }

    public String sendMessage(String message) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());
        oos.writeObject(message);
        var ois = new ObjectInputStream(socket1.getInputStream());
        String answer = (String) ois.readObject();
        return answer;


    }
}