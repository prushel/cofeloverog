package com.example.coffeeloverog;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController
{

    @FXML
    private TextField user;
    private PasswordField password;

    private Button login;


    protected void onLoginClick()
    {

        login.setText("something happend");

    }

}

