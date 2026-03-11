import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0;
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        salary = 30000;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

    void raiseSalary(double percent) {
        salary = salary + (salary * percent / 100);
    }

    void raiseSalary(int amount) {
        salary = salary + amount;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Rahul");
        Employee e3 = new Employee(102, "Anita", 50000);

        e1.display();
        e2.display();
        e3.display();

        e3.raiseSalary(10.5);
        e3.display();

        e2.raiseSalary(5000);
        e2.display();
    }
}