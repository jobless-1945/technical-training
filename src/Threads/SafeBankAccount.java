package Threads;

public class SafeBankAccount {
    int balance=1000;
    synchronized void withdraw(int amount){
        balance-=amount;
    }
    public static void main(String[] args) throws Exception {
        SafeBankAccount b=new SafeBankAccount();
        Thread t1=new Thread(() -> b.withdraw(500));
        Thread t2=new Thread(() -> b.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //join() will make sure that the main thread waits for the child threads to complete
        System.out.println("Final Balance: "+b.balance);
    }
}
/*
Code explaination:
The synchronization keyword ensures that only one thread can execute the withdraw() operation at a time,
preventing RACE CONDITION and ensuring correct balance deduction.
ℹ️Points to remember:
💠Synchronization avoids RACE CONDITION
💠Locks critical section in an application
💠Slower but safe
💠Essential for shared resources
 */