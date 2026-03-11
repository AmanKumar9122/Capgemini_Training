import java.util.*;

class Counter {
    private static int count = 0;
    private int id;

    public Counter() {
        count++;
        id = count;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println(id);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.display();
        c2.display();
        c3.display();

        System.out.println(Counter.getCount());
    }
}