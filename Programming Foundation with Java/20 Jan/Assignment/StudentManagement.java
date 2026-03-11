import java.util.*;

class Student {
    int id;
    String name;
    int m1;
    int m2;
    int m3;

    Student(int id, String name, int m1, int m2, int m3) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    String grade() {
        double avg = average();
        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 40)
            return "D";
        else
            return "F";
    }

    void display() {
        System.out.println(id + " " + name + " " + total() + " " + average() + " " + grade());
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student(1, "Aman", 80, 75, 90);
        Student s2 = new Student(2, "Rahul", 60, 65, 70);
        Student s3 = new Student(3, "Neha", 90, 92, 88);

        s1.display();
        s2.display();
        s3.display();
    }
}