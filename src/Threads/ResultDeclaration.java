package Threads;

public class ResultDeclaration {
    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval...");
        wait();
        System.out.println("Result declared");
    }
    synchronized void approve(){
        notify();
    }

    public static void main(String[] args) throws Exception{
        ResultDeclaration r=new ResultDeclaration();
        new Thread(() ->{
                    try{
                        r.declareResult();
                    }catch (Exception e){}
                }).start();
        Thread.sleep(2000);
        new Thread(() ->
            r.approve()).start();
    }
}
/*
The declareResult() method waits until another Thread calls notify().
During wait(), the thread releases the lock, allowing other thread to enter the synchronized code.
ℹ️ Points to remember:
💠sleep() -> time based
💠wait() -> condition based
💠wait() -> release lock -> by checking the notify() method
💠wait() is used in inter-threaded communication
⭐Order-Placed -> Preparing -> Prepared -> Delivering -> Delivered

 */
