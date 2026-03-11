package StreamApiTask;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class EmployeeStreamExample {

    // ---- Record ----
    public record Employee(
            int id,
            String name,
            String department,
            String jobTitle,
            int age,
            int yearsOfExperience,
            double salary,
            int performanceRating
    ) {}

    // ---- Seed Data ----
    static List<Employee> seedEmployees() {
        return List.of(
                new Employee(1, "Aman", "IT", "Manager", 32, 2, 150000, 9),
                new Employee(2, "Rohit", "IT", "Developer", 26, 3, 80000, 7),
                new Employee(3, "Sneha", "HR", "Manager", 29, 1, 120000, 6),
                new Employee(4, "Karan", "Finance", "Analyst", 35, 8, 90000, 8),
                new Employee(5, "Priya", "IT", "Manager", 30, 4, 110000, 7),
                new Employee(6, "Neha", "IT", "Developer", 24, 2, 70000, 9),
                new Employee(7, "Vikas", "Sales", "Manager", 38, 10, 180000, 8),
                new Employee(8, "Arjun", "Sales", "Executive", 27, 3, 60000, 5),
                new Employee(9, "Meera", "HR", "Manager", 31, 2, 130000, 7),
                new Employee(10, "Kabir", "IT", "Architect", 40, 12, 200000, 9),
                new Employee(11, "Riya", "Finance", "Manager", 28, 1, 105000, 8),
                new Employee(12, "Dev", "IT", "Developer", 25, 1, 65000, 6),
                new Employee(13, "Ankit", "Sales", "Manager", 33, 3, 99000, 7),
                new Employee(14, "Pooja", "HR", "Recruiter", 26, 2, 62000, 8),
                new Employee(15, "Manish", "IT", "Manager", 36, 2, 140000, 5)
        );
    }

    public static void main(String[] args) {

        List<Employee> employees = seedEmployees();

        // ================= TASK 1 =================
        List<String> result1 =
                employees.stream()

                        .filter(e -> e.jobTitle().equalsIgnoreCase("manager"))
                        .filter(e -> e.salary() > 100000)
                        .filter(e -> e.yearsOfExperience() <= 3)

                        .sorted(
                                Comparator.comparing(Employee::yearsOfExperience).reversed()
                                        .thenComparing(Employee::performanceRating)
                        )

                        .map(e -> new StringBuilder(e.name())
                                .reverse()
                                .toString()
                                .toUpperCase())

                        .toList();

        // ================= TASK 2 =================
//        Task 2:
//        Create a program that takes a list of Employee objects as input and performs the following operations:
//        Filter out all employees who have joined in the last 5 years and have a performance rating of less than 8, but have a salary between 60,000 and 120,000.
//        Sort the remaining employees in ascending order of their salaries, and then by their years of experience in descending order.
//        Return a new list containing the IDs of the remaining employees, but with each ID multiplied by 10.
        List<Integer> result2 =
                employees.stream()
                        .filter(e -> e.yearsOfExperience() <= 5)
                        .filter(e -> e.performanceRating() < 8)
                        .filter(e -> e.salary() >= 60000 && e.salary() <= 120000)
                        .sorted(
                                Comparator
                                        .comparing(Employee::salary)
                                        .thenComparing(
                                                Comparator.comparing(Employee::yearsOfExperience).reversed()
                                        )
                        )
                        .map(e -> e.id() * 10)
                        .toList();

        System.out.println("Task 1 Result:");
        result1.forEach(System.out::println);

        System.out.println("\nTask 2 Result:");
        result2.forEach(System.out::println);

    }
}
