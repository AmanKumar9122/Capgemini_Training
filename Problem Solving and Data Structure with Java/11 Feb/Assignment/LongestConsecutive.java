import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {

        int[] nums = { 100, 4, 200, 1, 3, 2 };

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) {
                int current = n;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        System.out.println(longest);
    }
}