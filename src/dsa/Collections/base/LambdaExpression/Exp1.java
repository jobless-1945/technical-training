package dsa.Collections.base.LambdaExpression;

public class Exp1 {
    public static void main(String[] args) {
        Runnable r= () -> {
            System.out.println("Thread is Running using lambda(->)");
        };
        Thread t=new Thread(r);
        t.start();
    }
}
