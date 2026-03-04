package Threads;

public class TickerTask implements Runnable{
    String task;
    TickerTask(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task+"in progress.");
    }
    public static void main(String[] args) {
        Thread t1=new Thread(new TickerTask("Seat Assignment"));
        Thread t2=new Thread(new TickerTask("Payment Processing"));
        Thread t3=new Thread(new TickerTask("SMS notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Each runnable object is a job, and the thread class is responsible only for execution,
which makes this approach cleaner
💠implement runnable
💠better design
💠interviews mostly ask this
💠support multiple inheritance via interfaces
 */
