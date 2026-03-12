package dsa.Collections.maps;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106,"Sharanya");
        ht.put(117,"Shreyas");
        ht.put(128,"Sonika");
        ht.put(100,"Siri");
        ht.put(99,"Sunil");
        ht.put(101,"Prasanth");
        System.out.println(ht.getOrDefault(106,"Not Found"));
        System.out.println(ht.getOrDefault(200,"Not Found"));
        ht.putIfAbsent(104,"Gaurav");//This will add if absent
        System.out.println(ht);
        ht.putIfAbsent(99,"ragav");
        System.out.println(ht);
    }//getOrDefault and putIfAbsent are most important function used in hashtable
}
