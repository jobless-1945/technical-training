package dsa.Collections.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrder=new ArrayList<>();
        //new orders are added
        liveOrder.add("Ord101");
        liveOrder.add("Ord102");
        liveOrder.add("Ord103");
        //check order
        System.out.println("Ord103 ? exists "+liveOrder.contains("Ord103"));
        //checks the live orders
        System.out.println("Live orders: "+liveOrder);
        //liveOrder.remove("Ord101"); will remove only one element while clear() removes everything
        liveOrder.clear();
        System.out.println("Orders after closing: "+liveOrder);
    }
}
