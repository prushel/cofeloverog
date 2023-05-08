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

            this.socket1 = new Socket(host.getHostName(), 9876);

    }

    public String sendMessage(String message) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());
        oos.writeObject(message);
        var ois = new ObjectInputStream(socket1.getInputStream());
        String answer = (String) ois.readObject();
        ois.close();
        return answer;




    }
}