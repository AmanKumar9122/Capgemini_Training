import java.util.*;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(calc.add(a, b));
        System.out.println(calc.add(a, b, c));
        System.out.println(calc.multiply(a, b));
        System.out.println(calc.subtract(a, b));

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println(calc.add(x, y));
        System.out.println(calc.multiply(x, y));
        System.out.println(calc.subtract(x, y));
    }
}