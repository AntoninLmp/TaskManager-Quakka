import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
