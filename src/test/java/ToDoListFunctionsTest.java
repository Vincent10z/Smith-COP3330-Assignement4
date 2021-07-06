import UCF.assignments.TodoListFunctions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

 class ToDoListFunctionsTest {

   // creating todolist
  private ArrayList<TodoListFunctions> TodoListFunctions;

 @Test
  void TodoListFunctions() {
   //new todolist
   //Todolist object
   TodoListFunctions = new ArrayList<>();
  }

  @Test
   void addTodoList(String name) {
   //new todolist
   //Adding a Todolist object in ArrayList
   //updates name when created
  }

  @Test
   void editTodolist(String selectedTask) throws NullPointerException {
   //new todolist
   //Edit Todolist array name
   // renames todolist from withing list
  }

  @Test
  void readFromFile(String filename) {
   //new todolist
   //data file from disk which will contain the data of previously saved todolist

  }

  @Test
  void  saveToFile(String filename) {
   //new todolist
   //write the data of Tasks from ArrayList to file
   // can be updated as Todolist can be merged from various other Todolists

  }
}
