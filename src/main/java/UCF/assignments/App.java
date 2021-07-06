/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Vincent Smith
 */
package UCF.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
        Parent root = FXMLLoader.load(getClass().getResource("../../../resources/UCF/Assignments/TaskList.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TODO List");
        primaryStage.show();
    } catch (IOException e){
        e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
