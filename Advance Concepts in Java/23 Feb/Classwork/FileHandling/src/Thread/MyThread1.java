package Thread;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from runnable");
    }
}