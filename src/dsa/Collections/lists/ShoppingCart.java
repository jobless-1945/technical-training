package dsa.Collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("Laptop");
        cart.add("Keyboard");
        cart.add("Mouse");
        cart.remove("Mouse");//Removes the item
        cart.set(1,"Mechanical keyboard");
        System.out.println(cart);
        System.out.println("Total Items: "+cart.size());
    }
}
