import java.util.ArrayList;

class TaskManager {
    private final ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<Task>();
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
    public Task getTaskById(int taskId) {
        return tasks.stream()
                .filter(task -> task.getId() == taskId)
                .findFirst()
                .orElseThrow();
    }


    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public Task getTask(int taskId){
        return tasks.stream()
                .filter(task -> task.getId() == taskId)
                .findFirst()
                .orElseThrow();
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    public void markTaskAsDone(int taskId) {
        tasks.stream()
                .filter(task -> task.getId() == taskId)
                .findFirst()
                .ifPresent(Task::markAsDone);
    }

    public void markTaskAsToDo(int taskId) {
        tasks.stream()
                .filter(task -> task.getId() == taskId)
                .findFirst()
                .ifPresent(Task::markAsToDo);
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No task yet");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}
