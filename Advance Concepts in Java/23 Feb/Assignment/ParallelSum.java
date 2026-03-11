import java.util.*;

class Computation extends Thread {
    int start;
    int end;
    long result;

    Computation(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            result += i;
        }
    }

    long getResult() {
        return result;
    }
}

public class ParallelSum {
    public static void main(String[] args) throws Exception {

        Computation t1 = new Computation(1, 500);
        Computation t2 = new Computation(501, 1000);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long total = t1.getResult() + t2.getResult();

        System.out.println(total);
    }
}