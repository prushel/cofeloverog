package com.example.coffeeloverog;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController extends ClientController
{


    @FXML
    private TextField user;
    @FXML
    private PasswordField password;

    @FXML
    private Button login;

    @FXML private Label info;


    @FXML
    protected void onLoginClick() throws IOException, ClassNotFoundException {


        var login = this.user.getText();
        var pw = this.password.getText();
        String[] creds = {login, pw};
        System.out.println(login);
        System.out.println(pw);
        if(1 == 2) {

            System.out.println("Login successful");
            GUIControl.loadNewScene("CoffeeView.fxml");

        }
        else {

            info.setText("Could not verify user " + login);


        }
        }




}

