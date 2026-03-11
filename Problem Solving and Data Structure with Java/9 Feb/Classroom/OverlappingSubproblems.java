import java.util.*;

public class OverlappingSubproblems {

    static int recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

    static int memo(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = memo(n - 1, dp) + memo(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursive(n));

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(memo(n, dp));
    }
}