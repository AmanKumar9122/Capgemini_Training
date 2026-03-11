import java.util.Scanner;

public class OperatorsControlAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int choice;

        System.out.println("Enter first number");
        num1 = sc.nextInt();

        System.out.println("Enter second number");
        num2 = sc.nextInt();

        System.out.println("1 Addition");
        System.out.println("2 Subtraction");
        System.out.println("3 Multiplication");
        System.out.println("4 Division");
        System.out.println("5 Modulus");

        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero not allowed");
                }
                break;

            case 5:
                System.out.println("Result: " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid choice");
        }

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("Sum of first 10 numbers: " + sum);

        int number;

        System.out.println("Enter a number to check even or odd");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

    }
}