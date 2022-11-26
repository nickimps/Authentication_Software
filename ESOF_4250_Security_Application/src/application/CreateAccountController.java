/**
 * Sample Skeleton for 'CreateAccountController.fxml' Controller Class
 */

package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CreateAccountController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="CreateAccountButton"
    private JFXButton CreateAccountButton; // Value injected by FXMLLoader

    @FXML // fx:id="errorLabel"
    private Label errorLabel; // Value injected by FXMLLoader

    @FXML // fx:id="cityBornTextField"
    private JFXTextField cityBornTextField; // Value injected by FXMLLoader

    @FXML // fx:id="highschoolAttendedTextField"
    private JFXTextField highschoolAttendedTextField; // Value injected by FXMLLoader

    @FXML // fx:id="makeOfFirstCarTextField"
    private JFXTextField makeOfFirstCarTextField; // Value injected by FXMLLoader

    @FXML // fx:id="favColourTextField"
    private JFXTextField favColourTextField; // Value injected by FXMLLoader

    @FXML // fx:id="favFoodTextField"
    private JFXTextField favFoodTextField; // Value injected by FXMLLoader

    @FXML // fx:id="fatherFirstNameTextField"
    private JFXTextField fatherFirstNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="favSport"
    private JFXTextField favSport; // Value injected by FXMLLoader

    @FXML // fx:id="mothersCityTextField"
    private JFXTextField mothersCityTextField; // Value injected by FXMLLoader

    @FXML // fx:id="bestFriendNameTextField"
    private JFXTextField bestFriendNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="streetFirstLivedOnTextField"
    private JFXTextField streetFirstLivedOnTextField; // Value injected by FXMLLoader

    @FXML // fx:id="favMovieTextField"
    private JFXTextField favMovieTextField; // Value injected by FXMLLoader

    @FXML // fx:id="dreamJobTextField"
    private JFXTextField dreamJobTextField; // Value injected by FXMLLoader

    @FXML // fx:id="childhoodHeroTextField"
    private JFXTextField childhoodHeroTextField; // Value injected by FXMLLoader

    @FXML // fx:id="favVacaySpotTextField"
    private JFXTextField favVacaySpotTextField; // Value injected by FXMLLoader

    @FXML // fx:id="firstPetNameTextField"
    private JFXTextField firstPetNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="celebCrushTextField"
    private JFXTextField celebCrushTextField; // Value injected by FXMLLoader

    @FXML // fx:id="mothersMaidenNameTextField"
    private JFXTextField mothersMaidenNameTextField; // Value injected by FXMLLoader

    @FXML // fx:id="favBookTextField"
    private JFXTextField favBookTextField; // Value injected by FXMLLoader

    @FXML // fx:id="favTypeOfMusicTextField"
    private JFXTextField favTypeOfMusicTextField; // Value injected by FXMLLoader

    @FXML // fx:id="hairColourTextField"
    private JFXTextField hairColourTextField; // Value injected by FXMLLoader

    @FXML
    void createAccountButtonPressed(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert CreateAccountButton != null : "fx:id=\"CreateAccountButton\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert errorLabel != null : "fx:id=\"errorLabel\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert cityBornTextField != null : "fx:id=\"cityBornTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert highschoolAttendedTextField != null : "fx:id=\"highschoolAttendedTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert makeOfFirstCarTextField != null : "fx:id=\"makeOfFirstCarTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert favColourTextField != null : "fx:id=\"favColourTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert favFoodTextField != null : "fx:id=\"favFoodTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert fatherFirstNameTextField != null : "fx:id=\"fatherFirstNameTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert favSport != null : "fx:id=\"favSport\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert mothersCityTextField != null : "fx:id=\"mothersCityTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert bestFriendNameTextField != null : "fx:id=\"bestFriendNameTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert streetFirstLivedOnTextField != null : "fx:id=\"streetFirstLivedOnTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert favMovieTextField != null : "fx:id=\"favMovieTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert dreamJobTextField != null : "fx:id=\"dreamJobTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert childhoodHeroTextField != null : "fx:id=\"childhoodHeroTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert favVacaySpotTextField != null : "fx:id=\"favVacaySpotTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert firstPetNameTextField != null : "fx:id=\"firstPetNameTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert celebCrushTextField != null : "fx:id=\"celebCrushTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert mothersMaidenNameTextField != null : "fx:id=\"mothersMaidenNameTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert favBookTextField != null : "fx:id=\"favBookTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert favTypeOfMusicTextField != null : "fx:id=\"favTypeOfMusicTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";
        assert hairColourTextField != null : "fx:id=\"hairColourTextField\" was not injected: check your FXML file 'CreateAccountController.fxml'.";

    }
}
