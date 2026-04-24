package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderReadFile {
    static void main(String[] args) throws Exception{
        // Can we create an object of a class inside constructor
        // ClassName obj=new ClassName(new ClassName());
        BufferedReader reader=new BufferedReader(new FileReader("./Demo/current_status.txt"));
        String str;
        while ((str=reader.readLine())!=null){
            System.out.println(str);
        }
        reader.close();
    }
}
