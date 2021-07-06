/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Vincent Smith
 */
package UCF.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ToDoListController {
    @FXML
    public void toDoListEntries(ActionEvent actionEvent) throws IOException {
        FXMLLoader Load = new FXMLLoader(getClass().getResource("Todolist.fxml"));
        Parent root1 = (Parent) Load.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setTitle("ToDoListPage");
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void FileMenuOpenListButton(ActionEvent actionEvent){
        //button opens a already created ToDOList
    }
    @FXML
    public void FileMenuSaveAsButton(ActionEvent actionEvent){
        //Button saves current todolist as new ToDOList
    }
    @FXML
    public void FileMenuAddNewTODOList(ActionEvent actionEvent){
        //Button adds a new ToDoList to mega list
    }
    @FXML
    public void FileMenuRemoveTODOList(ActionEvent actionEvent){
        //Button removes to do list from mega list
    }
    @FXML
    public void FileMenuCloseTODOList(ActionEvent actionEvent){
        //button closes current todolist
    }
    @FXML
    public void LoadSingleTodoList(ActionEvent actionEvent){
        //allows user to load a specific todolist from external storage
    }
    @FXML
    public void LoadMultipleTodoList(ActionEvent actionEvent){
        //allows user to load multiple to do lists from external storage
    }
}
