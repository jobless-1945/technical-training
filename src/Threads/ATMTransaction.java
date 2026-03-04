package Threads;

public class ATMTransaction extends Thread {
    public void run(){
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args) {
        ATMTransaction a=new ATMTransaction();
        System.out.println("Thread State: "+a.getState());
        a.start();
        System.out.println("Thread state after start: "+a.getState());
        try{
            a.wait(10);
            System.out.println(a.getState());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
/*
ℹ️code explaination:
initially the thread is in the NEW state.After calling start(), it moves to RUNNABLE and execute the run() method.
The exact timing of the state changes depends on the JVM scheduler
ℹ️Points to remember:
💠Thread is created once
💠start() changes state
💠Thread cannot be restarted
💠Final state is TREMINATED or DEAD
 */