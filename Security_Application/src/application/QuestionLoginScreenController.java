/**
 * Sample Skeleton for 'QuestionLoginScreenController.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
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

    @FXML // fx:id="Q1Label"
    private Label Q1Label; // Value injected by FXMLLoader

    @FXML // fx:id="Q1PassswordField"
    private PasswordField Q1PassswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q2Label"
    private Label Q2Label; // Value injected by FXMLLoader

    @FXML // fx:id="Q2PassswordField"
    private PasswordField Q2PassswordField; // Value injected by FXMLLoader

    @FXML // fx:id="Q3Label"
    private Label Q3Label; // Value injected by FXMLLoader

    @FXML // fx:id="Q3PassswordField"
    private PasswordField Q3PassswordField; // Value injected by FXMLLoader
    
    @FXML // fx:id="backButton"
    private Button backButton; // Value injected by FXMLLoader
    
    //Global scenes
    private Main main;
    private Scene sceneAccessGranted;
    private Scene sceneLogin;
    private String username;
    
    private int Q1, Q2, Q3;
    
    private String[][] questions = {{"In what city were you born?", "What highschool did you attend?", "What was the make of your first car?", "What is your favourite colour?", "What is your favourite food?", "What is your father's first name?", "What is your best friend's name?", "On what street did you first live?", "What is your favourite movie?", "What is your dream job?", "Who was your childhood hero?", "Favourite vacation spot?", "What is the name of your first pet?", "Who is your celebrity crush?", "What is your mother's maiden name?", "What is your favourite book?", "What is your favourite type of music?", "What is your natural hair colour?"},
			{"CityBornTextField", "HighschoolTextField", "MakeFirstCarTextField", "FavColourTextField", "FavFoodTextField", "FatherFirstNameTextField", "BestiesNameTextField", "FirstLiveStreetTextField", "FavMovieTextField", "DreamJobTextField", "ChildhoodHeroTextField", "VacaySpotTextField", "FirstPetTextField", "CelebCrushTextField", "MothersMaidenNameTextField", "FavBookTextField", "FavTypeMusicTextField", "NaturalHairColourTextField"}};
    
    
    /**
     * Passes in the scenes to the class so that we can access other functions in the code
     * 
     * @param main
     * @param sceneAccessGranted
     * @param sceneLogin
     */
    public void setScenes(Main main, Scene sceneAccessGranted, Scene sceneLogin) {
    	this.main = main;
    	this.sceneAccessGranted = sceneAccessGranted;
    	this.sceneLogin = sceneLogin;
    }
    
    /**
     * sets the username of the user so that we can show their name
     * 
     * @param username
     */
    public void getUsername(String username) {
    	this.username = username;
    }
    
    /**
     * When the user logins in the loginScreenController, this function has the questions present for them.
     */
    public void loadQuestions() {
    	
    	//Change the label
    	HelloLabel.setText("Hello, " + username);
    	
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
				
				//Create random variable
				Random random = new Random();
				
				//Query to get seed number
				ResultSet rs = stmt.executeQuery("SELECT seed FROM Account WHERE username = '" + username + "';");
				
				//Get the seed and create a random number based on that seed
				rs.next();
			    String seed = rs.getString(1);
				random.setSeed(Integer.parseInt(seed));
				
				//Get three question indexes to pull from
				int q1 = random.nextInt(17);
				int q2 = random.nextInt(17);
				int q3 = random.nextInt(17);
				
				//Make sure the numbers are not duplicates
				while(q1 == q2 || q2 == q3) { q2 = random.nextInt(17); }
				while(q1 == q3 || q2 == q3) { q3 = random.nextInt(17); }
				
				//Assign questions and set text of the labels
				Q1 = q1;
				Q2 = q2;
				Q3 = q3;
				Q1Label.setText(questions[0][q1]);
				Q2Label.setText(questions[0][q2]);
				Q3Label.setText(questions[0][q3]);
				
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
    
    @FXML
    void backButtonPressed(ActionEvent event) {
    	ErrorLabel.setVisible(false);
    	Q1PassswordField.setText("");
		Q2PassswordField.setText("");
		Q3PassswordField.setText("");
		main.setScreen(sceneLogin);
    }

    @FXML
    void loginButtonPressed(ActionEvent event) {
    	//Make sure that each answer field has some sort of text in it.
    	if (Q1PassswordField.getText() == "" || Q2PassswordField.getText() == "" || Q3PassswordField.getText() == "") {
    		ErrorLabel.setVisible(true);
    		ErrorLabel.setText("Please answer all questions.");
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
    				
    				//Query to get seed number from the user
    				ResultSet rs = stmt.executeQuery("SELECT seed FROM Account WHERE username = '" + username + "';");
    				rs.next();
    				
    				//Get the questions answers for the user
    				rs = stmt.executeQuery("SELECT " + questions[1][Q1] + "," + questions[1][Q2] + "," + questions[1][Q3] + " FROM Account WHERE username = '" + username + "';");
    				rs.next();
    				 				
    				//If all answer fields are equal to the correct answers then Update the database with the new generated seed, clear the fields and grant the user access
    				if (rs.getString(1).equals(Q1PassswordField.getText()) && rs.getString(2).equals(Q2PassswordField.getText()) && rs.getString(3).equals(Q3PassswordField.getText())) {
    					int newSeed = (int) ((Math.random() * (5000 - 1)) + 1);
    					stmt.executeUpdate("UPDATE Account SET seed = " + newSeed + " WHERE username = '" + username + "'");
    					
    					Q1PassswordField.setText("");
        				Q2PassswordField.setText("");
        				Q3PassswordField.setText("");
    					
    					main.setScreen(sceneAccessGranted);
    				}
    				else {
    					//Show error labels
    					ErrorLabel.setVisible(true);
    					ErrorLabel.setText("Incorrect answer(s).");
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
