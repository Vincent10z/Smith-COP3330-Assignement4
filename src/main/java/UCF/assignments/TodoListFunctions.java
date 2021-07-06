/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Vincent Smith
 */
package UCF.assignments;
import java.util.ArrayList;

public class TodoListFunctions {
    // An array list of todolist objects
    private ArrayList<TodoListFunctions> TodoListFunctions;


    public TodoListFunctions() {
        //Todolist object
        TodoListFunctions = new ArrayList<>();
    }


    public void addTodoList(String name) {
        //Adding a Todolist object in ArrayList
    }


    public void editTodolist(String selectedTask) throws NullPointerException {
        //Edit Todolist array name
    }


    public String readFromFile(String filename) {
        //data file from disk which will contain the data of previously saved todolist
        return "";
    }


    public boolean saveToFile(String filename) {
        //write the data of Tasks from ArrayList to file
        return saveToFile(filename);
    }
}