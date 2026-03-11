// design a program to process large input and find the top 3 most frequent words, considering performance.
// Extreme Brute Force without hashmap or sorting
import java.io.*;

public class Q10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of words:");
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        System.out.println("Start entering words one by one:");
        for(int i=0; i<n; i++){
            words[i] = br.readLine();
        }

        String first = "", second = "", third = "";
        int firstCount = 0, secondCount = 0, thirdCount = 0;

        for(int i=0; i<n; i++){
            String currentWord = words[i];
            int count = 0;
            for(int j=0; j<n; j++){
                if(currentWord.equals(words[j])){
                    count++;
                }
            }

            if(count > firstCount){
                third = second;
                thirdCount = secondCount;
                second = first;
                secondCount = firstCount;
                first = currentWord;
                firstCount = count;
            } else if(count > secondCount && !currentWord.equals(first)){
                third = second;
                thirdCount = secondCount;
                second = currentWord;
                secondCount = count;
            } else if(count > thirdCount && !currentWord.equals(first) && !currentWord.equals(second)){
                third = currentWord;
                thirdCount = count;
            }
        }

        System.out.println("Top 3 most frequent words:");
        System.out.println("1st: " + first + " (Frequency: " + firstCount + ")");
        System.out.println("2nd: " + second + " (Frequency: " + secondCount + ")");
        System.out.println("3rd: " + third + " (Frequency: " + thirdCount + ")");
        
    }
    
}
