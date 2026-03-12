package dsa.Collections.base.LambdaExpression;

import java.util.ArrayList;
// Java StreamAPI - Java 8 (::) -> streams (->) Lambda
public class Exp4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(n -> System.out.println(n));//Lambda
        list.forEach(System.out::println);//Stream Api Java 8
    }
}
