import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println(taskManager.getTasks().size());
            taskManager.displayTasks();
            System.out.print(">>> ");
            String input = scanner.nextLine().trim();
            String[] instructions = input.split(" ", 2);
            command = instructions[0];
            System.out.println("command:" + command);
            String description = instructions.length > 1 ? instructions[1].trim() : "";

            //if (!input.isEmpty()) {

            switch (command) {
                case "+":
                    taskManager.addTask(description);
                    break;
                case "-":
                    int removeId = Integer.parseInt(description);
                    taskManager.removeTask(removeId);
                    break;
                case "x":
                    int doneId = Integer.parseInt(description);
                    taskManager.markTaskAsDone(doneId);
                    break;
                case "o":
                    int todoId = Integer.parseInt(description);
                    taskManager.markTaskAsToDo(todoId);
                    break;
                default:
                    System.out.println("Please retry");
                    break;
            }
            //}
        } while (!command.equalsIgnoreCase("q"));

        System.out.println("Bye!");
    }
}
