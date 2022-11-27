/**
 * Sample Skeleton for 'CreateAccountController.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class CreateAccountController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
    @FXML // fx:id="BackButton"
    private Button BackButton; // Value injected by FXMLLoader

    @FXML // fx:id="BestiesNameTextField"
    private TextField BestiesNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="CelebCrushTextField"
    private TextField CelebCrushTextField; // Value injected by FXMLLoader

    @FXML // fx:id="ChildhoodHeroTextField"
    private TextField ChildhoodHeroTextField; // Value injected by FXMLLoader

    @FXML // fx:id="CityBornTextField"
    private TextField CityBornTextField; // Value injected by FXMLLoader

    @FXML // fx:id="CreateAccountButton"
    private Button CreateAccountButton; // Value injected by FXMLLoader

    @FXML // fx:id="DreamJobTextField"
    private TextField DreamJobTextField; // Value injected by FXMLLoader

    @FXML // fx:id="ErrorLabel"
    private Label ErrorLabel; // Value injected by FXMLLoader

    @FXML // fx:id="FatherFirstNameTextField"
    private TextField FatherFirstNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="FavBookTextField"
    private TextField FavBookTextField; // Value injected by FXMLLoader

    @FXML // fx:id="FavColourTextField"
    private TextField FavColourTextField; // Value injected by FXMLLoader

    @FXML // fx:id="FavFoodTextField"
    private TextField FavFoodTextField; // Value injected by FXMLLoader

    @FXML // fx:id="FavMovieTextField"
    private TextField FavMovieTextField; // Value injected by FXMLLoader

    @FXML // fx:id="FavTypeMusicTextField"
    private TextField FavTypeMusicTextField; // Value injected by FXMLLoader

    @FXML // fx:id="FirstLiveStreetTextField"
    private TextField FirstLiveStreetTextField; // Value injected by FXMLLoader

    @FXML // fx:id="FirstPetTextField"
    private TextField FirstPetTextField; // Value injected by FXMLLoader

    @FXML // fx:id="HelloLabel"
    private Label HelloLabel; // Value injected by FXMLLoader

    @FXML // fx:id="HighschoolTextField"
    private TextField HighschoolTextField; // Value injected by FXMLLoader

    @FXML // fx:id="MakeFirstCarTextField"
    private TextField MakeFirstCarTextField; // Value injected by FXMLLoader

    @FXML // fx:id="MothersMaidenNameTextField"
    private TextField MothersMaidenNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="NaturalHairColourTextField"
    private TextField NaturalHairColourTextField; // Value injected by FXMLLoader
    
    @FXML // fx:id="PasswordTextField"
    private TextField PasswordTextField; // Value injected by FXMLLoader

    @FXML // fx:id="UserNameTextField"
    private TextField UserNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="VacaySpotTextField"
    private TextField VacaySpotTextField; // Value injected by FXMLLoader
    
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
    void backButtonPressed(ActionEvent event) {
    	resetFields();
    	main.setScreen(sceneLogin);
    }    

    @FXML
    void createAccountButtonPressed(ActionEvent event) {
    	
    	if (UserNameTextField.getText() == "" || PasswordTextField.getText() == "" || BestiesNameTextField.getText() == "" || CelebCrushTextField.getText() == "" || ChildhoodHeroTextField.getText() == "" || CityBornTextField.getText() == "" || DreamJobTextField.getText() == "" ||
				FatherFirstNameTextField.getText() == "" || FavBookTextField.getText() == "" || FavColourTextField.getText() == "" || FavFoodTextField.getText() == "" || FavMovieTextField.getText() == "" || FavTypeMusicTextField.getText() == "" || FirstLiveStreetTextField.getText() == "" ||
				FirstPetTextField.getText() == "" || HighschoolTextField.getText() == "" || MakeFirstCarTextField.getText() == "" || MothersMaidenNameTextField.getText() == "" || NaturalHairColourTextField.getText() == "" || VacaySpotTextField.getText() == "") {
    		ErrorLabel.setVisible(true);
			ErrorLabel.setText("Please answer all questions.");
			ErrorLabel.setTextFill(Color.web("#ff4a1c"));
    	} else {
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
    				
    				int newSeed = (int) ((Math.random() * (5000 - 1)) + 1);
    			    
    				//check to make sure no fields are empty
    				if (UserNameTextField.getText() != "" && PasswordTextField.getText() != "" && BestiesNameTextField.getText() != "" && CelebCrushTextField.getText() != "" && ChildhoodHeroTextField.getText() != "" && CityBornTextField.getText() != "" && DreamJobTextField.getText() != "" 
    						&& FatherFirstNameTextField.getText() != "" && FavBookTextField.getText() != "" && FavColourTextField.getText() != "" && FavFoodTextField.getText() != "" && FavMovieTextField.getText() != "" && FavTypeMusicTextField.getText() != "" && FirstLiveStreetTextField.getText() != "" 
    						&& FirstPetTextField.getText() != "" && HighschoolTextField.getText() != "" && MakeFirstCarTextField.getText() != "" && MothersMaidenNameTextField.getText() != "" && NaturalHairColourTextField.getText() != "" && VacaySpotTextField.getText() != "") {
    					
    					//Insert Account Information into the database
    					stmt.executeUpdate("INSERT INTO Account VALUES ('" + UserNameTextField.getText() + "','" + PasswordTextField.getText() + "','" + BestiesNameTextField.getText() + "','" + CelebCrushTextField.getText() + "','" + ChildhoodHeroTextField.getText() + "','"
    																		+ CityBornTextField.getText() + "','" + DreamJobTextField.getText() + "','" + FatherFirstNameTextField.getText() + "','" + FavBookTextField.getText() + "','" + FavColourTextField.getText() + "','"
    																		+ FavFoodTextField.getText() + "','" + FavMovieTextField.getText() + "','" + FavTypeMusicTextField.getText() + "','" + FirstLiveStreetTextField.getText() + "','" + FirstPetTextField.getText() + "','"
    																		+ HighschoolTextField.getText() + "','" + MakeFirstCarTextField.getText() + "','" + MothersMaidenNameTextField.getText() + "','" + NaturalHairColourTextField.getText() + "','" + VacaySpotTextField.getText() + "','"
    																		+ newSeed + "')");
    				}
    				    			    
    				resetFields();
    				ErrorLabel.setVisible(true);
    				ErrorLabel.setText("Account Successfully Created!");
    				ErrorLabel.setTextFill(Color.web("#7ac24f"));
    				
    			} 
    			catch (SQLIntegrityConstraintViolationException e) {
    				ErrorLabel.setVisible(true);
    				ErrorLabel.setText("Username already exists.");
    				ErrorLabel.setTextFill(Color.web("#ff4a1c"));
    			}
    			catch (com.mysql.cj.jdbc.exceptions.MysqlDataTruncation e) {
    				ErrorLabel.setVisible(true);
    				ErrorLabel.setText("One of your answers are too long.");
    				ErrorLabel.setTextFill(Color.web("#ff4a1c"));
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
    
    /**
	 * Reset the fields
	 */
    void resetFields() {
    	UserNameTextField.setText("");
    	PasswordTextField.setText("");
    	BestiesNameTextField.setText("");
    	CelebCrushTextField.setText("");
    	ChildhoodHeroTextField.setText("");
    	CityBornTextField.setText("");
    	DreamJobTextField.setText("");
    	FatherFirstNameTextField.setText("");
    	FavBookTextField.setText("");
    	FavColourTextField.setText("");
    	FavFoodTextField.setText("");
    	FavMovieTextField.setText("");
    	FavTypeMusicTextField.setText("");
    	FirstLiveStreetTextField.setText("");
    	FirstPetTextField.setText("");
    	HighschoolTextField.setText("");
    	MakeFirstCarTextField.setText("");
    	MothersMaidenNameTextField.setText("");
    	NaturalHairColourTextField.setText("");
    	VacaySpotTextField.setText("");
    	ErrorLabel.setVisible(false);
    	ErrorLabel.setTextFill(Color.web("#ff4a1c"));
    }

}
