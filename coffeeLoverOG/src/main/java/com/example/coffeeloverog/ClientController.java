package com.example.coffeeloverog;
import Client.Client;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable
{

    protected Client clientSeivce;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        try {
            this.clientSeivce = new Client();
            clientSeivce.StartClient();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }



}
