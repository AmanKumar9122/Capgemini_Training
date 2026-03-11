import java.util.Scanner;

public class OperatorsControlClasswork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter first number");
        a = sc.nextInt();

        System.out.println("Enter second number");
        b = sc.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        int x = a;
        x += b;
        System.out.println("After += : " + x);

        x -= b;
        System.out.println("After -= : " + x);

        x *= 2;
        System.out.println("After *= : " + x);

        x /= 2;
        System.out.println("After /= : " + x);

        if (a > b) {
            System.out.println("First number is greater");
        } else if (a < b) {
            System.out.println("Second number is greater");
        } else {
            System.out.println("Both numbers are equal");
        }

        int i = 1;

        while (i <= 5) {
            System.out.println("While loop value: " + i);
            i++;
        }

        for (int j = 1; j <= 5; j++) {
            System.out.println("For loop value: " + j);
        }

        int k = 1;

        do {
            System.out.println("Do while value: " + k);
            k++;
        } while (k <= 3);

    }
}