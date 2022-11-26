/**
 * Sample Skeleton for 'QuestionLoginController.fxml' Controller Class
 */

package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class QuestionLoginController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Q1Label"
    private Label Q1Label; // Value injected by FXMLLoader

    @FXML // fx:id="Q1PasswordField"
    private JFXPasswordField Q1PasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q2Label"
    private Label Q2Label; // Value injected by FXMLLoader

    @FXML // fx:id="Q2PasswordField"
    private JFXPasswordField Q2PasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q3Label"
    private Label Q3Label; // Value injected by FXMLLoader

    @FXML // fx:id="Q3PasswordField"
    private JFXPasswordField Q3PasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="LoginButton"
    private JFXButton LoginButton; // Value injected by FXMLLoader

    @FXML // fx:id="errorLabel"
    private Label errorLabel; // Value injected by FXMLLoader

    @FXML // fx:id="WelcomeLabel"
    private Label WelcomeLabel; // Value injected by FXMLLoader

    @FXML
    void loginButtonPressed(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Q1Label != null : "fx:id=\"Q1Label\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert Q1PasswordField != null : "fx:id=\"Q1PasswordField\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert Q2Label != null : "fx:id=\"Q2Label\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert Q2PasswordField != null : "fx:id=\"Q2PasswordField\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert Q3Label != null : "fx:id=\"Q3Label\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert Q3PasswordField != null : "fx:id=\"Q3PasswordField\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert LoginButton != null : "fx:id=\"LoginButton\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert errorLabel != null : "fx:id=\"errorLabel\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";
        assert WelcomeLabel != null : "fx:id=\"WelcomeLabel\" was not injected: check your FXML file 'QuestionLoginController.fxml'.";

    }
}
