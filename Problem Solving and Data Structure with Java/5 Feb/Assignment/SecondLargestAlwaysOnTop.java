import java.util.Scanner;
import java.util.Stack;

public class SecondLargestAlwaysOnTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element in array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);        
    }
    public static int findSecondLargest(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for (int num : arr) {
            s.push(num);
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        while (!s.isEmpty()) {
            int current = s.pop();
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }
        return secondLargest;
    }
}
