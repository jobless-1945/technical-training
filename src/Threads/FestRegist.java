package Threads;

public class FestRegist {
    static class FormFill extends Thread{
        public void run(){
            System.out.println("Form filling started");
        }
    }
    static class DocuUpload extends Thread{
        public void run(){
            System.out.println("Document Upload started");
        }
    }
    static class EmailNoti extends Thread{
        public void run(){
            System.out.println("Confirmation email sent");
        }
    }
    public static void main(String[] args) {
        FormFill f=new FormFill();
        DocuUpload d=new DocuUpload();
        EmailNoti e=new EmailNoti();
        
        f.start();
        d.start();
        e.start();
    }
}
/*
💠Java prg starts with one main thread
💠Thread allow parallel execution -> concurrency
💠Output order is not guaranteed
💠Threads share the same memory
💠Improves the performance & responsiveness
💠When start() is called, the jvm creates a new thread
💠When run() is called directly, there is no cocncurrency
ℹ️Process vs thread
Process is a running program
Thread: A path of execution inisde the prg
A process has its own memory
Threads share the same memory
Creating a thread is cheaper than creating a process
Ex: Process ->Chrome Browser Thread -> New tab
closing a tab will not close chrome
 */
