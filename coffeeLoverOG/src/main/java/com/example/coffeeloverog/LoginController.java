package com.example.coffeeloverog;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    protected void onPasswordEnter() throws IOException, ClassNotFoundException {
        this.onLoginClick();
    }

    @FXML
    protected void onLoginClick() throws IOException, ClassNotFoundException {


        var login = this.user.getText();
        var pw = this.password.getText();
        String[] creds = {"Login", login, pw};

        Object answer = clientService.sendMessage(creds);
        String b = answer.toString();


        if(b ==  "true") {

            System.out.println("Logged in as" + login);
            GUIControl.loadNewScene("CoffeeView.fxml");

        }
        else if(b == "false") {
            System.out.println("Could not verify");
            info.setText("Could not verify user " + login);


        }


        }




}

