// remove every alternate element using stack without using any other data structure
import java.util.Scanner;
import java.util.Stack;
public class RemoveMidElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element in stack");
        int n = sc.nextInt();
            Stack<Integer> s = new Stack<>();
            for(int i=0;i<n;i++){
                s.push(sc.nextInt());
            }
        removeMidElements(s,0,n);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void removeMidElements(Stack<Integer> s,int curr,int n){
        if(s.isEmpty() || curr==n){
            return;
        }
        int temp = s.pop();
        removeMidElements(s,curr+1,n);
        if(curr%2==0){
            s.push(temp);
        }
    }
}

