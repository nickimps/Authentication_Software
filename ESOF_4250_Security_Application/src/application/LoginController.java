/**
 * Sample Skeleton for 'LoginScreenController.fxml' Controller Class
 */

package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoginController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="UserNameTextField"
    private JFXTextField UserNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="PasswordPasswordField"
    private JFXPasswordField PasswordPasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="errorLabel"
    private Label errorLabel; // Value injected by FXMLLoader

    @FXML // fx:id="ProceedButton"
    private JFXButton ProceedButton; // Value injected by FXMLLoader

    @FXML // fx:id="CreateAccountButton"
    private JFXButton CreateAccountButton; // Value injected by FXMLLoader

    @FXML // fx:id="WelcomeLabel"
    private Label WelcomeLabel; // Value injected by FXMLLoader

    @FXML
    void createAccountButtonPressed(ActionEvent event) {

    }

    @FXML
    void proceedButtonPressed(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert UserNameTextField != null : "fx:id=\"UserNameTextField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert PasswordPasswordField != null : "fx:id=\"PasswordPasswordField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert errorLabel != null : "fx:id=\"errorLabel\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert ProceedButton != null : "fx:id=\"ProceedButton\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert CreateAccountButton != null : "fx:id=\"CreateAccountButton\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert WelcomeLabel != null : "fx:id=\"WelcomeLabel\" was not injected: check your FXML file 'LoginScreenController.fxml'.";

    }
}
