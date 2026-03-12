package dsa.Collections.base.LambdaExpression;

import java.util.ArrayList;

class Products{
    String name;
    int price,quantity;
    public Products(String name,int price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Products> products=new ArrayList<>();
        products.add(new Products("Laptop",10000,500));
        products.add(new Products("PC",15000,200));
        products.add(new Products("Mobile",5000,1000));
        products.add(new Products("Tablet",6000,700));
        System.out.println("Before sorting");
        for (Products p: products){
            System.out.println(p.name+" "+p.price+" "+p.quantity);
        }
        products.sort((p1,p2)->p2.quantity-p1.quantity);
        System.out.println("After sorting");
        for (Products p: products){
            System.out.println(p.name+" "+p.price+" "+p.quantity);
        }
    }
}
