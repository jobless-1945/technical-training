package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferReaderWriterData {
    static void main(String[] args) throws Exception {
        String[] names={"Nirmal","Anup","Raushan"};
        BufferedWriter writer=new BufferedWriter(new FileWriter("./Demo/demo.txt",true));
        writer.write("\nWriting line 3 to the file.");
        for(String name:names){
            writer.write("\n"+name);
        }
        writer.close();
    }
}
