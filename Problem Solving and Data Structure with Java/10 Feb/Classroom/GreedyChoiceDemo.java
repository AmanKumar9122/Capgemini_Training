import java.util.*;

public class GreedyChoiceDemo {

    static int minCoins(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 5, 10, 20, 50 };

        System.out.println(minCoins(coins, 93));
    }
}