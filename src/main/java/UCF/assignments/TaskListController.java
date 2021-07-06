/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Vincent Smith
 */
package UCF.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TaskListController {

    @FXML
    public void ListAddNewItem(ActionEvent actionEvent){
        //Button allows user to add a new item to the Todolist
    }
    @FXML
    public void ListEditItemDescription(ActionEvent actionEvent){
        //button allows user to edit description of item in todolist
    }
    @FXML
    public void ListEditItemName(ActionEvent actionEvent){
        //text field to edit the name of an item
    }
    @FXML
    public void ListRemoveItem(ActionEvent actionEvent){
        //allows user to remove item from existing todolist
    }
    @FXML
    public void ListEditDueDateOfItem(ActionEvent actionEvent){
        //allows user to edit the due date of an item in an existing
        //todolist
    }
    @FXML
    public void ListMarkItemComplete(ActionEvent actionEvent){
        //allows user to mark an item in the existing todolist as
        //complete
    }
    @FXML
    public void DisplayAllItemsOfTodoList(ActionEvent actionEvent){
        //allows user to display every item from existing todolist
    }
    @FXML
    public void DisplayIncompleteItemsOfTodoList(ActionEvent actionEvent){
        //allows user to display incomplete items from existing todolist
    }
    @FXML
    public void DisplayCompleteItemsOfTodoList(ActionEvent actionEvent){
        //allows user to display complete items from existing todolist
    }
    @FXML
    public void SaveAllItemsOfTodoList(ActionEvent actionEvent){
        //allows user to save all items of todolist to external storage
    }
    @FXML
    public void SaveAllItemsOfEveryTodoList(ActionEvent actionEvent){
        //allows user to save every item from all existing todolists to external storage
    }


}
