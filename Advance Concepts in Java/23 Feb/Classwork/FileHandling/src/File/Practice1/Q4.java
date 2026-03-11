//Count Character
package File.Practice1;

import java.io.FileReader;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        int count = 0;
        int ch;
        while((ch=fr.read())!=-1){
            count ++;
        }
        fr.close();
        System.out.println("Total characters: " + count);
    }
}
