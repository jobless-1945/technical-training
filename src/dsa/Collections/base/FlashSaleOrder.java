package dsa.Collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class FlashSaleOrder {
    public static void main(String[] args) {
        Collection<Integer> orderIds=new ArrayList<>();
        orderIds.add(101);
        orderIds.add(102);
        orderIds.add(103);
        System.out.println("Order recieved: "+orderIds);
        System.out.println("No. of orders: "+orderIds.size());
    }
}
