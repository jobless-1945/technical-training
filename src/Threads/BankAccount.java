package Threads;

public class BankAccount {
    int balance=1000;
    void withdraw(int amount){
        balance-=amount;
    }
    public static void main(String[] args) throws Exception {
        BankAccount b=new BankAccount();
        Thread t1=new Thread(() -> b.withdraw(500));
        Thread t2=new Thread(() -> b.withdraw(500));
        t1.start();
        t2.start();
//        t1.join();
//        t2.join();
        //join() will make sure that the main thread waits for the child threads to complete
        System.out.println("Final Balance: "+b.balance);
    }
}
/*
Both the threads t1 & t2 access & modify the same balance variable
simultaneously. Due to lack of synchronisation, the final balance becomes inconsistent.
ℹ️Points to remember:
💠Shared data causes issues
💠Execution order is unpredictable
💠Leads to data inconsistency
💠Need synchronisation to solve the RACE CONDITION
 */