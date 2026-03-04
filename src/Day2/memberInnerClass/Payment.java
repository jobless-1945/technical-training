package Day2.memberInnerClass;

public interface Payment {
    void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        Payment p=new Payment() {
            //Boilerplate code
            @Override
            public void pay() {
                System.out.println("Payment done using credit card");
            }
        };
        p.pay();
        //SCALA - Java 8 (Streams,annotation,lambdas,reflection)
        Payment p1= () -> System.out.println("Cash payment");
        p1.pay();
    }
}
/*
ℹ️Points to remember
💠One time implementation
💠No need to create seperate class
💠It is used in events & callback functions
 */
