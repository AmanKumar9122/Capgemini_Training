import java.util.*;

class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student s = (Student) obj;
        return id == s.id && Objects.equals(name, s.name);
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toString() {
        return id + " " + name;
    }
}

public class EqualityDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman");
        Student s2 = new Student(1, "Aman");
        Student s3 = new Student(2, "Rahul");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);

        for (Student s : set) {
            System.out.println(s);
        }
    }
}