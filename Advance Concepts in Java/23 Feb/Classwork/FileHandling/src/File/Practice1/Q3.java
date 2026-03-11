//Create Folder and File Inside
package File.Practice1;

import java.io.File;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) throws IOException {
        File folder = new File("myFolder");
        if(folder.mkdir()){
            System.out.println("Folder created");
        }
        File file = new File("myFolder/practice2");
        if(file.createNewFile()){
            System.out.println("File created inside folder");
        }
    }
}
