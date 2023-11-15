public class Task {
    private static int lastId = 1;
    private final int id;
    private final String description;
    private String status;

    public Task(String description) {
        this.description = description;
        this.id = lastId++;
        this.status = " ";
    }

    public String getDescription() {
        return description;
    }
    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }

    public void markAsDone() {
        this.status = "done";
    }

    public void markAsToDo() {
        this.status = "todo";
    }

    @Override
    public String toString() {
        return id + " [" + (status.equals("done") ? "x" : " ") + "] " + description;
    }
}
