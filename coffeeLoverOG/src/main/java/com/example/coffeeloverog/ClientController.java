package com.example.coffeeloverog;
import Client.Client;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable
{

    protected Client clientService;

    public ClientController ()
    {
        this.clientService = new Client();
        clientService.StartClient();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {



    }



}
