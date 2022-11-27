/*
 * ESOF 4250 Project
 * 
 * Nicholas Imperius
 * Jimmy Tsang
 * 
 * Main.java
 */

package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	//Global Variables
	LoginScreenController loginScreenController;
	QuestionLoginScreenController questionLoginScreenController;
	AccessGrantedController accessGrantedController;
	CreateAccountController createAccountController;

	// Primary Stage
    Stage stage;
    
    //Scenes for each UI screen
    Scene sceneLogin;
    Scene sceneQuestionLogin;
    Scene sceneAccessGranted;
    Scene sceneCreateAccount;
    
    // The panes are associated with the respective .fxml files
    private Pane paneLogin;
    private Pane paneQuestionLogin;
    private Pane paneAccessGranted;
    private Pane paneCreateAccount;
	
    /**
     * Starts the interface
     */
	@Override
	public void start(Stage mainStage) throws Exception {
		try {
			//Set stage as main stage
			stage = mainStage;
			
			
			//Load the FXML's and their specific controller classes
			FXMLLoader fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("LoginScreenController.fxml"));
			paneLogin = fxmlloader.load();
			LoginScreenController loginScreenController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("QuestionLoginScreenController.fxml"));
			paneQuestionLogin = fxmlloader.load();
			QuestionLoginScreenController questionLoginScreenController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("AccessGrantedController.fxml"));
			paneAccessGranted = fxmlloader.load();
			AccessGrantedController accessGrantedController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("CreateAccountController.fxml"));
			paneCreateAccount = fxmlloader.load();
			CreateAccountController createAccountController = fxmlloader.getController();
			
			//Set Scenes to the loaded FXML's
			Scene sceneLogin = new Scene(paneLogin);
			Scene sceneQuestionLogin = new Scene(paneQuestionLogin);
			Scene sceneAccessGranted = new Scene(paneAccessGranted);
			Scene sceneCreateAccount = new Scene(paneCreateAccount);
			
			//Pass Reference to their controller classes
			//	Allows us to send the what the next scene would be so that when a button is pressed we can easily swap to that scene
			loginScreenController.setScenes(this, sceneQuestionLogin, sceneCreateAccount, questionLoginScreenController);
			questionLoginScreenController.setScenes(this, sceneAccessGranted, sceneLogin);
			accessGrantedController.setScenes(this, sceneLogin);
			createAccountController.setScenes(this, sceneLogin);
			
			

			//Finally, set the initial UI screen that the user sees
			stage.setScene(sceneLogin);
			stage.setTitle("Cyberlytics Authentication");
			stage.show();
			
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Sets the scene
	 * 
	 * @param sc Scene to be set to
	 */
	public void setScreen(Scene sc) {
		stage.setScene(sc);
	}
	
	/**
	 * Main Function
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
