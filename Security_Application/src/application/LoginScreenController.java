/**
 * Sample Skeleton for 'LoginScreenController.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginScreenController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="CreateAccountButton"
    private Button CreateAccountButton; // Value injected by FXMLLoader

    @FXML // fx:id="ErrorLabel"
    private Label ErrorLabel; // Value injected by FXMLLoader

    @FXML // fx:id="PasswordPasswordField"
    private PasswordField PasswordPasswordField; // Value injected by FXMLLoader

    @FXML // fx:id="ProceedButton"
    private Button ProceedButton; // Value injected by FXMLLoader

    @FXML // fx:id="UserNameTextField"
    private TextField UserNameTextField; // Value injected by FXMLLoader
    
    private QuestionLoginScreenController questionLoginScreenController;
    
    //Global scenes
    private Main main;
    private Scene sceneQuestionLogin;
    private Scene sceneCreateAccount;
    
    /**
     * Passes in the scenes to the class so that we can access other functions in the code
     * 
     * @param main
     * @param sceneQuestionLogin
     * @param sceneCreateAccount
     * @param questionLoginScreenController
     */
    public void setScenes(Main main, Scene sceneQuestionLogin, Scene sceneCreateAccount, QuestionLoginScreenController questionLoginScreenController) {
    	this.main = main;
    	this.sceneQuestionLogin = sceneQuestionLogin;
    	this.sceneCreateAccount = sceneCreateAccount;
    	this.questionLoginScreenController = questionLoginScreenController;
    }

    @FXML
    void createAccountButtonPressed(ActionEvent event) {
    	// Change the scene and clear any textfields and labels
    	main.setScreen(sceneCreateAccount);
    	UserNameTextField.setText("");
    	PasswordPasswordField.setText("");
    	ErrorLabel.setVisible(false);
    }

    @FXML
    void proceedButtonPressed(ActionEvent event) {
    	// If either the username or the password are empty, throw an error
    	if (UserNameTextField.getText() == "" || PasswordPasswordField.getText() == "") {
    		ErrorLabel.setVisible(true);
    		ErrorLabel.setText("Please enter a username/password.");
    	}
    	else {
    		//Try-Catch
        	try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (Exception e) {
                e.printStackTrace();
            }

        	//Try-Catch
    		try {
    			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AuthenticationSystem?" + "user=root");
    			
    			//Try-Catch
    			try {
    				Statement stmt = conn.createStatement();
    				
    				// Query the database for the account information
    				ResultSet rs = stmt.executeQuery("SELECT password FROM Account WHERE username = '" + UserNameTextField.getText() + "';");
    				
    				//If the account exists, otherwise alert user
    				if (rs.next()) {
    					//If the password matches, then grant access to the question screen and clear textfields
    					if (PasswordPasswordField.getText().equals(rs.getString(1))) {
        					questionLoginScreenController.getUsername(UserNameTextField.getText());
        		        	questionLoginScreenController.loadQuestions();
        		        	
        		        	UserNameTextField.setText("");
        		        	PasswordPasswordField.setText("");
        		        	ErrorLabel.setVisible(false);
        		        	
        		        	main.setScreen(sceneQuestionLogin);
        				} else {
        					//Show error label
        					ErrorLabel.setVisible(true);
        		    		ErrorLabel.setText("Incorrect username/password.");
        				}
    				} else {
    					//Show error label
    					ErrorLabel.setVisible(true);
    		    		ErrorLabel.setText("Incorrect username/password.");
    				}
    				
    			}
    			catch (SQLException e) {
    				e.printStackTrace();
    			}

    			//Close the connection
    			conn.close();
    		} catch (SQLException e) {
    			e.printStackTrace();
    		}
    	}	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {    	
    	ErrorLabel.setVisible(false);
    }

}
