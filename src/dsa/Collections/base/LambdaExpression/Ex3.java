package dsa.Collections.base.LambdaExpression;
interface Square{
    int calculate(int x);
}
public class Ex3 {
    public static void main(String[] args) {
        Square s=(x)->x*x;
        System.out.println("Square: "+s.calculate(4));
    }
}
