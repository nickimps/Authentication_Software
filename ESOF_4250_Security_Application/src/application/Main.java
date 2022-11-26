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
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Main extends Application {
	
	//Global Variables
	AccessGrantedController accessGrantedController;
	LoginController loginController;
	QuestionLoginController questionLoginController;
	CreateAccountController createAccountController;

	// Primary Stage
    Stage stage;
    
    //Scenes for each UI screen
    Scene sceneLogin;
    Scene sceneQuestionLogin;
    Scene sceneCreateAccount;
    Scene sceneAccessGranted;
    
    // The panes are associated with the respective .fxml files
    private Pane paneAccessGranted;
    private Pane paneLogin;
    private Pane paneQuestionLogin;
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
			fxmlloader.setLocation(Main.class.getResource("LoginController.fxml"));
			paneLogin = fxmlloader.load();
			LoginController loginController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("QuestionLoginController.fxml"));
			paneQuestionLogin = fxmlloader.load();
			QuestionLoginController questionLoginController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("CreateAccountController.fxml"));
			paneCreateAccount = fxmlloader.load();
			CreateAccountController createAccountController = fxmlloader.getController();
			
			fxmlloader = new FXMLLoader();
			fxmlloader.setLocation(Main.class.getResource("AccessGrantedController.fxml"));
			paneAccessGranted = fxmlloader.load();
			AccessGrantedController accessGrantedController = fxmlloader.getController();
			

			//Set Scenes to the loaded FXML's
			Scene sceneLogin = new Scene(paneLogin);
			Scene sceneQuestionLogin = new Scene(paneQuestionLogin);
			Scene sceneCreateAccount = new Scene(paneCreateAccount);
			Scene sceneAccessGranted = new Scene(paneAccessGranted);
			
			
			/*
			//Pass Reference to their controller classes
			//	Allows us to send the what the next scene would be so that when a button is pressed we can easily swap to that scene
			loginController.setMainScene(this, memberID);
			loginController.setLoginPressScene(sceneStudentWelcomeScreen, sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen);
			
			addCourseController.setMainScene(this);
			addCourseController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			addEmployeeController.setMainScene(this);
			addEmployeeController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			dropCoursesController.setMainScene(this);
			dropCoursesController.setBackPressedScene(sceneStudentWelcomeScreen);
			
			employeeListController.setMainScene(this);
			employeeListController.setBackPressedScene(sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen);
			
			viewCoursesController.setMainScene(this);
			viewCoursesController.setBackPressedScene(sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen, sceneStudentWelcomeScreen);
			
			modifyGradesController.setMainScene(this);
			modifyGradesController.setBackPressedScene(sceneInstructorWelcomeScreen);
			
			registerForCoursesController.setMainScene(this);
			registerForCoursesController.setBackPressedScene(sceneStudentWelcomeScreen);
			
			studentListController.setMainScene(this);
			studentListController.setBackPressedScene(sceneAdminWelcomeScreen, sceneInstructorWelcomeScreen);
			
			searchCoursesController.setMainScene(this);
			searchCoursesController.setBackPressedScene(sceneStudentWelcomeScreen);
			
			removeEmployeeController.setMainScene(this);
			removeEmployeeController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			removeCourseController.setMainScene(this);
			removeCourseController.setBackPressedScene(sceneAdminWelcomeScreen);
			
			//Set the different controllers within the system
			studentWelcomeScreenController.setMainScene(this);
			studentWelcomeScreenController.setLogoutPressedScene(sceneLogin);
			studentWelcomeScreenController.setDropCoursesPressedScene(sceneDropCourses);
			studentWelcomeScreenController.setRegisterCoursesPressedScene(sceneRegisterCourse);
			studentWelcomeScreenController.setSearchCoursesPressedScene(sceneSearchCourses);
			studentWelcomeScreenController.setViewCoursesPressedScene(sceneViewCourses);
			studentWelcomeScreenController.setViewGradesPressedScene(sceneViewCourses);
			studentWelcomeScreenController.setViewCoursesController(viewCoursesController);
			studentWelcomeScreenController.setDropCoursesController(dropCoursesController);
			
			instructorWelcomeScreenController.setMainScene(this);
			instructorWelcomeScreenController.setEmployeeListPressedScene(sceneEmployeeList);
			instructorWelcomeScreenController.setLogoutPressedScene(sceneLogin);
			instructorWelcomeScreenController.setModifyGradesPressedScene(sceneModifyGrades);
			instructorWelcomeScreenController.setStudentListPressedScene(sceneStudentList);
			instructorWelcomeScreenController.setViewActiveCoursesPressedScene(sceneViewCourses);
			instructorWelcomeScreenController.setViewCoursesController(viewCoursesController);
			instructorWelcomeScreenController.setEmployeeListController(employeeListController);
			instructorWelcomeScreenController.setStudentListController(studentListController);
			instructorWelcomeScreenController.setModifyGradesController(modifyGradesController);
			
			adminWelcomeScreenController.setMainScene(this);
			adminWelcomeScreenController.setAddCoursePressedScene(sceneAddCourse);
			adminWelcomeScreenController.setAddEmployeePressedScene(sceneAddEmployee);
			adminWelcomeScreenController.setEmployeeListPressedScene(sceneEmployeeList);
			adminWelcomeScreenController.setLogoutPressedScene(sceneLogin);
			adminWelcomeScreenController.setRemoveCoursePressedScene(sceneRemoveCourse);
			adminWelcomeScreenController.setRemoveEmployeePressedScene(sceneRemoveEmployee);
			adminWelcomeScreenController.setStudentListPressedScene(sceneStudentList);
			adminWelcomeScreenController.setViewActiveCoursesPressedScene(sceneViewCourses);
			adminWelcomeScreenController.setViewCoursesController(viewCoursesController);	
			adminWelcomeScreenController.setEmployeeListController(employeeListController);
			adminWelcomeScreenController.setStudentListController(studentListController);
			adminWelcomeScreenController.setAddCourseController(addCourseController);
			adminWelcomeScreenController.setAddEmployeeController(addEmployeeController);
			adminWelcomeScreenController.setRemoveCourseController(removeCourseController);
			adminWelcomeScreenController.setRemoveEmployeeController(removeEmployeeController);
			adminWelcomeScreenController.loadInstructorsPre();
			
			*/
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
