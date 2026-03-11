import java.util.Scanner;

public class LoopsClasswork {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter a number");
        n = sc.nextInt();

        System.out.println("For Loop");

        for (int i = 1; i <= n; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("While Loop");

        int j = 1;

        while (j <= n) {

            if (j == 8) {
                break;
            }

            System.out.println(j);
            j++;
        }

        System.out.println("Do While Loop");

        int k = 1;

        do {

            System.out.println(k);
            k++;

        } while (k <= 5);

    }
}