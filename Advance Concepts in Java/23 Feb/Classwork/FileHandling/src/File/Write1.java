package File;

import java.io.FileWriter;
import java.io.IOException;

public class Write1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("Hello Aman\n");
        fw.write("File handling start");
        fw.close();
    }
}
