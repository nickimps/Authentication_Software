/**
 * Sample Skeleton for 'AccessGrantedController.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class AccessGrantedController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="LogoutButton"
    private Button LogoutButton; // Value injected by FXMLLoader
    
    //Global scenes
    private Main main;
    private Scene sceneLogin;
    
    /**
     * Sets the main scene of the program
     * 
     * @param main The scene of the main
     */
    public void setScenes(Main main, Scene sceneLogin) {
    	this.main = main;
    	this.sceneLogin = sceneLogin;
    }

    @FXML
    void logoutButtonPressed(ActionEvent event) {
    	main.setScreen(sceneLogin);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    }

}
