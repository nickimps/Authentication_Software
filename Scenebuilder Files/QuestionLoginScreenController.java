/**
 * Sample Skeleton for 'LoginScreenController.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class QuestionLoginScreenController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="ErrorLabel"
    private Label ErrorLabel; // Value injected by FXMLLoader

    @FXML // fx:id="HelloLabel"
    private Label HelloLabel; // Value injected by FXMLLoader

    @FXML // fx:id="LoginButton"
    private Button LoginButton; // Value injected by FXMLLoader

    @FXML // fx:id="Q1PassswordField"
    private PasswordField Q1PassswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q1PasswordField"
    private Label Q1PasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q2PassswordField"
    private PasswordField Q2PassswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q2PasswordField"
    private Label Q2PasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q3PassswordField"
    private PasswordField Q3PassswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q3PasswordField"
    private Label Q3PasswordField; // Value injected by FXMLLoader

    @FXML
    void loginButtonPressed(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert ErrorLabel != null : "fx:id=\"ErrorLabel\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert HelloLabel != null : "fx:id=\"HelloLabel\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert LoginButton != null : "fx:id=\"LoginButton\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert Q1PassswordField != null : "fx:id=\"Q1PassswordField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert Q1PasswordField != null : "fx:id=\"Q1PasswordField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert Q2PassswordField != null : "fx:id=\"Q2PassswordField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert Q2PasswordField != null : "fx:id=\"Q2PasswordField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert Q3PassswordField != null : "fx:id=\"Q3PassswordField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";
        assert Q3PasswordField != null : "fx:id=\"Q3PasswordField\" was not injected: check your FXML file 'LoginScreenController.fxml'.";

    }

}
