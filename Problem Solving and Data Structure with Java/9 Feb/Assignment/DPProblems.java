import java.util.*;

public class DPProblems {

    static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    static int rodCut(int[] price, int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = Math.max(dp[i], price[j] + dp[i - j - 1]);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int[] coins = { 1, 2, 5 };
        System.out.println(coinChange(coins, 11));

        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
        System.out.println(rodCut(price, 8));
    }
}