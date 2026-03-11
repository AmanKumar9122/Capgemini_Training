//Create file → write name → read it
package File.Practice1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) throws IOException {
        File f = new File("practice.txt");
        if(f.createNewFile()){
            System.out.println("File created");
        } else {
            System.out.println("Already exists");
        }

        FileWriter fw = new FileWriter("practice.txt");
        fw.write("Aman");
        fw.close();

        FileReader fr = new FileReader("practice.txt");
        int ch;
        while((ch=fr.read()) != -1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
