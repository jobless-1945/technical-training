package FileHandling;

import java.io.File;

public class CreateFile {
    static void main(String[] args) throws Exception {
        // File extension is needed, or else a junk file will be created
        File file=new File("./Demo/current_status.txt");
        if(file.createNewFile()){
            System.out.println("File: "+file.getName()+" created.");
        }else{
            System.out.println("Failed to create the file.");
        }
    }

}
