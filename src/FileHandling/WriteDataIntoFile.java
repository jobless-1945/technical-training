package FileHandling;

import java.io.FileWriter;

public class WriteDataIntoFile {
    static void main(String[] args) throws Exception {
        FileWriter writer=new FileWriter("./Demo/current_status.txt",true);
        writer.append("\nConsistency is key");
        writer.close();
        System.out.println("Wrote data into the file.");
    }
}
