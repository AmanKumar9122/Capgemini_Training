package File;

import java.io.FileReader;
import java.io.IOException;

public class Read1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        int ch;
        while((ch=fr.read()) != -1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
