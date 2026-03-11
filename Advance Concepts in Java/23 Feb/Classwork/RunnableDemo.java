import java.util.*;

class Task implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        Task task = new Task();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}