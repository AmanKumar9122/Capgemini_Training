package File;

import java.io.File;

public class FileBasic3 {
    public static void main(String[] args) {
        File dir = new File("testFolder");
        if(dir.mkdir()){
            System.out.println("Folder created");
        }
        File[] files = dir.listFiles();
        if(files != null){
            for(File f : files){
                System.out.println(f.getName());
            }
        }
    }
}
