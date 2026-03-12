package dsa.Collections.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106,"Sharanya");
        ht.put(117,"Shreyas");
        ht.put(128,"Sonika");
        ht.put(100,"Siri");
        ht.put(99,"Sunil");
        ht.put(101,"Prasanth");
        //ht.put(null,"rahul"); No null keys allowed in Hashtable it will produce null pointer exception
        //can pass null values not null keys
        for(Map.Entry<Integer,String> entry: ht.entrySet()){
            System.out.println(entry.getKey()+" ,"+entry.getValue());
        }
        ht.remove(101);
        System.out.println(ht);
    }
}
