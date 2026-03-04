package ExceptionHandling;

import java.io.IOException;
/*
java.io.IOException -> fully qualified class name
For checked exception we always use try-catch block
the 'throw' keyword doesnt handle the exception
It only passes on the information to the calling method
the calling method has to handle the exception using try-catch
the 'throws' keyword is written in the method signature(name)
 */
public class CheckedException {
    static void readFile()throws Exception{
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try{
            display();
        }catch (Exception e){
            System.out.println(e.getMessage());//this is just for the ("Message")
        }
    }
    static void display()throws Exception{
        readFile();
    }
}
