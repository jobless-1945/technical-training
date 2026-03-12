package dsa.Collections.base.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Exp5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println("Initial list: "+list);
        list.sort((a, b) -> a - b);//Ascending
        System.out.println("Sorted list: "+list);
        list.sort((a, b) -> b - a);//Descending
        System.out.println(("Sorted List: ")+list);
    }
}
