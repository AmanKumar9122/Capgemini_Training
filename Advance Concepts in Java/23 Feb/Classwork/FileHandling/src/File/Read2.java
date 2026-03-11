package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
