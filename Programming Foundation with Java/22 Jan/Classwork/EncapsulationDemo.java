import java.util.*;

class Person {
    private int id;
    private String name;
    private int age;

    public Person() {
        id = 0;
        name = "Unknown";
        age = 0;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();
        p1.setId(1);
        p1.setName("Aman");
        p1.setAge(22);
        p1.display();

        Person p2 = new Person(2, "Ravi", 25);
        p2.display();

        System.out.println(p1.getName());
        System.out.println(p2.getAge());
    }
}