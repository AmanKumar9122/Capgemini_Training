import java.util.*;

class WorkerThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {

        WorkerThread t1 = new WorkerThread();
        WorkerThread t2 = new WorkerThread();

        t1.start();
        t2.start();
    }
}