import org.junit.Test;

import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void statusIsDone(){
        Task task = new Task("Test");
        task.markAsDone();
        assertEquals(task.getStatus(),"done");
    }
    @Test
    public void statusIsToDo(){
        Task task = new Task("Test");
        task.markAsToDo();
        assertEquals(task.getStatus(),"todo");
    }
    @Test
    public void statusIsEmptyWhenItIsCreated (){
        Task task = new Task("Test");
        assertEquals(task.getStatus()," ");
    }

    @Test
    public void descriptionIsNotEmpty(){
        Task task = new Task("Test");
        assertNotNull(task.getDescription());
    }
    @Test
    public void descriptionIsGood(){
        String maDescription = "Test";
        Task task = new Task(maDescription);
        assertEquals(task.getDescription(),maDescription);
    }

    @Test
    public void idIsIncrementing() {
        Task firstTask = new Task("task1");
        Task secondTask = new Task("task2");
        assertEquals(secondTask.getId(), firstTask.getId() + 1);
    }
}
