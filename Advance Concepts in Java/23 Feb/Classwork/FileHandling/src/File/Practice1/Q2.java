//Append multiple lines
package File.Practice1;

import java.io.FileWriter;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("practice.txt",true);
        fw.write("First appended line\n");
        fw.write("Second appended line\n");
        fw.write("Third appended line\n");
        fw.close();
    }
}
