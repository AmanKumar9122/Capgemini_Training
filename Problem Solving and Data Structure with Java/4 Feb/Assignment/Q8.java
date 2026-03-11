import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of elements:");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Start Entering elements one by one:");
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : al){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
        sc.close();
    }
}
