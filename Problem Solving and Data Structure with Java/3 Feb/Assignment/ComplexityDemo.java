import java.util.*;

public class ComplexityDemo {

    static void constantTime() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    static void linearTime(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void quadraticTime(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        constantTime();
        linearTime(n);
        quadraticTime(n);
    }
}