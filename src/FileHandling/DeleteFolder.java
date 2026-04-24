package FileHandling;

import java.io.File;

public class DeleteFolder {
    static void main(String[] args) {
        // .(dot) the current directory
        // to enter the current dir - we use forward slash /
        File folder=new File("./Demo/F1/F2/F3/F4");
        if(folder.delete()){
            System.out.println("Folder: "+folder.getName()+" deleted.");
        }else{
            System.out.println("Failed to delete the folder.");
        }
    }
}
