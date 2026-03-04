package Threads;

public class JoinProof {
    static class Task extends Thread{
        public void run(){
            try {
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println("Task Finished");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task t1=new Task();
        t1.start();//The main thread doesnt wait for this Thread
        t1.join();//Code will wait(guaranteed)
        System.out.println("Main thread resumes");
    }
}
