import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TaskManagerTest {
    private static final TaskManager taskManager = new TaskManager();



    @Test
    public void addingTask(){
        int sizeList = taskManager.getTasks().size();
        taskManager.addTask("Helloworld");
        ArrayList<Task> tasksList = taskManager.getTasks();
        assertEquals(tasksList.size(), sizeList + 1);
        assertEquals(tasksList.get(tasksList.size()-1).getDescription(), "Helloworld");
    }
    @Test
    public void deleteTask(){
        int startSize = taskManager.getTasks().size();
        taskManager.addTask("Deleted task");

        Task task = taskManager.getTaskById(startSize+1);
        taskManager.removeTask(task.getId());

        assertEquals(startSize, taskManager.getTasks().size());
    }

    @Test
    public void statusToDone(){
        int taskId = 1;
        taskManager.addTask("task1");
        taskManager.markTaskAsDone(taskId);
        assertEquals("done", taskManager.getTask(taskId).getStatus());
    }

    @Test
    public void statusToTodo(){
        int taskId = 1;
        taskManager.addTask("task1");
        taskManager.markTaskAsToDo(taskId);
        assertEquals("todo", taskManager.getTask(taskId).getStatus());
    }
}
