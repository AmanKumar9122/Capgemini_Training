import java.util.Scanner;

public class LoopsAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Enter a number");
        number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0) {
                continue;
            }

            sum += i;

            if (sum > 100) {
                break;
            }

        }

        System.out.println("Sum value: " + sum);

        System.out.println("Prime numbers up to given number");

        for (int i = 2; i <= number; i++) {

            boolean prime = true;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }

            }

            if (prime) {
                System.out.println(i);
            }

        }

        System.out.println("Multiplication table");

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i + " = " + (number * i));

        }

    }
}