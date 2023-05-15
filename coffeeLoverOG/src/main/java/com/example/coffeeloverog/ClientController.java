package com.example.coffeeloverog;
import Client.Client;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable
{

    protected Client clientService;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        this.clientService = new Client();
        clientService.StartClient();
        System.out.println("Client started");


    }



}
