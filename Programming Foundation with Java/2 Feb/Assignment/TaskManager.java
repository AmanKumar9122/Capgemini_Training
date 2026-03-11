import java.util.*;

class Task {
    int id;
    String name;

    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class TaskManager {
    public static void main(String[] args) {

        Queue<Task> tasks = new LinkedList<>();

        tasks.add(new Task(1, "Compile"));
        tasks.add(new Task(2, "Test"));
        tasks.add(new Task(3, "Deploy"));

        for (Task t : tasks) {
            System.out.println(t);
        }

        System.out.println(tasks.poll());

        tasks.add(new Task(4, "Monitor"));

        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}