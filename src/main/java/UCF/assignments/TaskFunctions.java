/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Vincent Smith
 */
package UCF.assignments;

import java.time.DateTimeException;
import java.time.LocalDate;


public class  TaskFunctions {
    //String that holds the title of a task
    private String name;
    //String that holds the description of the task
    private String description;
    //boolean value, if true: the task is completed, otherwise false.
    private boolean complete;
    //the due date of the task as yyyy-mm-dd format
    private LocalDate dueDate;


    public void setTaskName(String name) throws NullPointerException {
        //set title of task object
        //throw null pointer exception if title is null or empty string
    }


    public void setTaskDescription(String description) {
        //method to set the project name
        //can be empty string
    }


    public boolean markInComplete() {
        //mark task as incomplete
        //return value of field incompleted
        return false;
    }

    public boolean markCompleted() {
        //method to mark a task as complete
        //return the updated value of the completed field
        return false;
    }

    public LocalDate getDueDate() {
        //get the due date of task
        //return due date of task
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) throws DateTimeException {
        //set due date of task
    }

    // A method to count the number of tasks with completed status
    public int completedCount() {
        return completedCount();
    }

    //A method to count the number of tasks with incomplete status
    public int notCompletedCount() {
        return 0;
    }
}