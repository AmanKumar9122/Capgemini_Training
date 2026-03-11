import java.util.Scanner;

public class JavaBasicsAssignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        double marks = sc.nextDouble();
        char grade = sc.next().charAt(0);
        boolean result = sc.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }
}