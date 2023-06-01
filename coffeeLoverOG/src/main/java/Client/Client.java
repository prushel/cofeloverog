package Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This class implements java socket client
 * @author pankaj
 *
 */
public class Client {

    private  Socket socket1 = null;

    public void StartClient(){
        //get the localhost IP address, if server is running on some other IP, you need to use that

        InetAddress host = null;
        try {
            host = InetAddress.getLocalHost();
            this.socket1 = new Socket(host.getHostName(), 9876);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        catch(IOException e) {
            System.out.println("Verbindung zum Server nicht möglich");

        }



    }

    public void CloseClient() throws IOException {
        socket1.close();
    }
    public Object sendMessage(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());
        oos.writeObject(args);
        var ois = new ObjectInputStream(socket1.getInputStream());
        Object answer = ois.readObject();
        return answer;



    }
    public void getSchedules() throws IOException, ClassNotFoundException
    {
        String[] args = {"getSchedule"};


        this.sendMessage(args);


    }

   


}