package dsa.Collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> ord=new LinkedList<>();
        //FOr adding u can use add[fail][strict] or offer[not fail][not strict]
        ord.add("ord101");//Strict capacity based
        ord.offer("ord102");//this is flexible
        System.out.println(ord);
        //For removal we can use remove()[fail][strict] or poll()[not strict][fail]
        System.out.println("Serving: "+ord.poll());
        System.out.println("Orders: "+ord);
    }
}
