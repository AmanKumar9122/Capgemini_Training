import java.util.*;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        queue.offer("Task4");
        queue.offer("Task5");

        for (String t : queue) {
            System.out.println(t);
        }
    }
}