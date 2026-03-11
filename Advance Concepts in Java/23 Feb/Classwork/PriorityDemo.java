import java.util.*;

class PriorityTask extends Thread {
    PriorityTask(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " " + getPriority() + " " + i);
            Thread.yield();
        }
    }
}

public class PriorityDemo {
    public static void main(String[] args) {

        PriorityTask t1 = new PriorityTask("Low");
        PriorityTask t2 = new PriorityTask("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}