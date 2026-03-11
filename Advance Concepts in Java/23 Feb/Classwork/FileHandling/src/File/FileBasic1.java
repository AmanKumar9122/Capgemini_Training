//File Handling
package File;

import java.io.File;
import java.io.IOException;

public class FileBasic1 {
    public static void main(String[] args) throws IOException {
        File f = new File("demo.txt");
        if(f.createNewFile()){
            System.out.println("File created");
        } else {
            System.out.println("Already exists");
        }
        System.out.println("Name:" + f.getName());
        System.out.println("Path:" + f.getAbsolutePath());
        System.out.println("Readable:" + f.canRead());
        System.out.println("Writable:" + f.canWrite());
        System.out.println("Size:" + f.length());
    }
}
