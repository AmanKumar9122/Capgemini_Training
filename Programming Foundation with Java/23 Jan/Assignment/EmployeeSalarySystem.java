import java.util.*;

interface Employee {
    double calculateSalary();
}

class FullTimeEmployee implements Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee implements Employee {
    int hours;
    double rate;

    PartTimeEmployee(int hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }
}

class ContractEmployee implements Employee {
    int projects;
    double projectRate;

    ContractEmployee(int projects, double projectRate) {
        this.projects = projects;
        this.projectRate = projectRate;
    }

    public double calculateSalary() {
        return projects * projectRate;
    }
}

public class EmployeeSalarySystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(120, 200);
        Employee e3 = new ContractEmployee(3, 15000);

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
        System.out.println(e3.calculateSalary());
    }
}