package dsa.Collections.maps;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //Order based on the natural order of the keys
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(3,"C");
        map.put(1,"A");
        map.put(2,"B");
        System.out.println(map);
    }
}
