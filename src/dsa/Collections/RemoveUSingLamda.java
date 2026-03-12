package dsa.Collections;

import java.util.ArrayList;

public class RemoveUSingLamda {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(5);
        list.add(6);
        list.add(21);
        System.out.println("before: "+list);
        //Remove the elements which are greater than 10
        list.removeIf(i -> i %2==0);
        System.out.println("After: "+list);
    }
}
