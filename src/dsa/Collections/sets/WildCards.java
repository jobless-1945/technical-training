package dsa.Collections.sets;

import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void printList(List<?> list){
        for(Object o:list){
            System.out.print(o+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        strings.add("java");
        strings.add("Python");
        strings.add("C++");
        printList(strings);
        List<Integer> integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        printList(integers);
    }
}
