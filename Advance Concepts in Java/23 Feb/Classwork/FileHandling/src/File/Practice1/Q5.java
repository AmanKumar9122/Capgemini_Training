// Count Lines
package File.Practice1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        br.close();
        System.out.println("Total lines: " + count);
    }
}
