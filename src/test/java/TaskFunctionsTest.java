import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDate;

class TaskFunctionsTest {
    @Test
    public void setTaskName(String name) throws NullPointerException {
        //new task
        //set title of task
    }
    @Test
    public void setTaskDescription(String project) {
        //new task
        //set description of task
    }

    @Test
    public boolean markInComplete() {
        //new task
        //method to mark task as incomplete
        //return value of field incompleted
        return false;
    }
    @Test
    public boolean markCompleted() {
        //new task
        //method to mark a task as complete
        //return the updated value of the completed field
        return false;
    }
    @Test
    public void setDueDate(LocalDate dueDate) throws DateTimeException {
        //new task
        //set due date of task
    }

}
