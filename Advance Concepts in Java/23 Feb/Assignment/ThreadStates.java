import java.util.*;

class StateTask extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Running " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class ThreadStates {
    public static void main(String[] args) throws Exception {

        StateTask t = new StateTask();

        System.out.println(t.getState());

        t.start();

        System.out.println(t.getState());

        Thread.sleep(200);

        System.out.println(t.getState());

        t.join();

        System.out.println(t.getState());
    }
}