/*
 * Class: CMSC203 CRN 22557 
 * Program: Assignment 6 Implementation 
 * Instructor: Prof. Kuijt 
 * Summary of Description: Write an application that lets the user order Alcohol, Coffee, or Smoothies.
 * If the user is under 18, access to Alcohol is barred.   
 * Due Date: 11/26/2023 
 * Integrity Pledge: I pledge that I have completed the programming assignment independently. 
 * I have not copied the code from a student or any source. 
 * Student: Andrew Bezwada 
 */

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
