package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4 {
    public static void main(String[] args) throws IOException {
        String s;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter any data: ");
            s=br.readLine();
            System.out.println(s);
            //br.close();Not needed closed automatically by autoclose
        }
    }
}

