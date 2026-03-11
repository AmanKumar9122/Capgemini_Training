import java.util.*;

class User {
    private Integer id;
    private String name;

    User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    protected void finalize() {
        System.out.println("Garbage collected " + id);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            users.add(new User(i, "User" + i));
        }

        for (User u : users) {
            System.out.println(u);
        }

        users = null;

        System.gc();

        Integer a = 100;
        Integer b = 200;
        Integer result = a + b;

        System.out.println(result);

        Double d1 = 12.5;
        Double d2 = 7.5;
        Double res = d1 + d2;

        System.out.println(res);
    }
}