package Thread;

public class Main {
    public static void main(String[] args) throws Exception {

        // Thread class (your existing one)
        MyThread myThread = new MyThread();
        myThread.setName("Aman");
        System.out.println(myThread.getName());
        System.out.println(myThread.getPriority());

        myThread.start();

        // ---- execute MyThread1 ----
        MyThread1 task = new MyThread1();
        Thread t2 = new Thread(task);
        t2.start();

        System.out.println("Main");

        System.out.println(myThread.isAlive());

//        myThread.join();   // wait MyThread
//        t2.join();         // wait MyThread1
        MyThread.sleep(20000);

        System.out.println("end///////////////////");
    }
}
