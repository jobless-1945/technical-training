package Threads;

public class DeadLockDemo {
    static final Object accountA=new Object();
    static final Object accountB=new Object();

    public static void main(String[] args) {
        Thread t1=new Thread(() -> {
            synchronized (accountA){
                System.out.println("Thread 1 locked accountA");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountB){
                    System.out.println("Thread 1 locked accountB");
                }
            }
        });
        Thread t2=new Thread(() -> {
            synchronized (accountB){
                System.out.println("Thread 2 locked accountB");
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountA){
                    System.out.println("Thread 2 locked acoountA");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
/*
Thread - 1 acquires a lock on Account A and then sleeps,
giving thread 2 to acquire a lock on account B. Now, Thread - 1 waits for Account A &
Thread - 2 waits for account B .Since neither thread releases the lock. Both keep
waiting & thus creating a DEADLOCK.
ℹ️DEADLOCK EXPLAINATION: Deadlock occurs when each thread is holding a resource
& waiting for the other to release it.
*/
