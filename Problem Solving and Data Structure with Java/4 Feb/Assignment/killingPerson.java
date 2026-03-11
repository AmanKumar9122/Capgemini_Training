import java.util.Scanner;

public class killingPerson {
    public static int kill(int n, int k){
        int result = 0;
        for(int i=1;i<=n;i++){
            result = (result + k) % i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int alive = kill(n,k);
        System.out.println(arr[alive]);
        sc.close();
    }
}
