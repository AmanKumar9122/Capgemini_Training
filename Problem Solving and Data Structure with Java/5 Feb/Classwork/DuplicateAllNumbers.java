import java.util.Scanner;
import java.util.Stack;

public class DuplicateAllNumbers {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the no. of element in stack");
         int n = sc.nextInt();
         Stack<Integer> s = new Stack<>();
         for(int i=0;i<n;i++){
            s.push(sc.nextInt());
         }
        duplicate(s);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void duplicate(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        duplicate(s);
        s.push(temp);
        s.push(temp);
    }
}
