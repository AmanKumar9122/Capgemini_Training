package File;

import java.io.File;

public class FileBasic2 {
    public static void main(String[] args) {
        File f = new File("demo.txt");
        if(f.delete()){
            System.out.println("Deleted");
        } else {
            System.out.println("Not deleted");
        }
    }
}
