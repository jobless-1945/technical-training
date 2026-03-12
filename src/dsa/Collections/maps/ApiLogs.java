package dsa.Collections.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ApiLogs {
    public static void main(String[] args) {
        //LinkedHashMap to maintain the insertion order
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("2","Signup");
        logs.put("1","Login");
        logs.put("4","Browse Video");
        logs.put("3","Scroll Up or Scroll Down");
        logs.put("5","Logout");
        System.out.println(logs);
    }
}
