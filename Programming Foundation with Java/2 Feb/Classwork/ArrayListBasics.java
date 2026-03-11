import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 10; i >= 1; i--) {
            numbers.add(i);
        }

        Collections.sort(numbers);

        for (Integer n : numbers) {
            System.out.println(n);
        }

        int sum = 0;

        for (Integer n : numbers) {
            sum += n;
        }

        System.out.println(sum);

        double avg = (double) sum / numbers.size();
        System.out.println(avg);

        Integer[] arr = { 5, 3, 8, 1, 9 };
        Arrays.sort(arr);

        for (Integer a : arr) {
            System.out.println(a);
        }
    }
}