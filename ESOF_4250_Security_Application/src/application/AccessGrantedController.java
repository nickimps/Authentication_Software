/**
 * Sample Skeleton for 'AccessGrantedController.fxml' Controller Class
 */

package application;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AccessGrantedController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="LogoutButton"
    private JFXButton LogoutButton; // Value injected by FXMLLoader

    @FXML
    void logoutButtonPressed(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert LogoutButton != null : "fx:id=\"LogoutButton\" was not injected: check your FXML file 'AccessGrantedController.fxml'.";

    }
}
