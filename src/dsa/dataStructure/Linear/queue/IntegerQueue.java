package dsa.dataStructure.Linear.queue;

public class IntegerQueue {
    private static final int MAXSIZE=10;
    private int[] arr=new int[MAXSIZE];
    private int front;
    private int rear;
    public IntegerQueue(){
        front=rear=-1;//The queue is empty initially
    }
    public boolean isEmpty(){
        return (front==-1 && rear==-1);
    }
    public boolean isFull(){
        return rear==MAXSIZE-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }if(isEmpty()){
            front=rear=1;
        }else{
            rear++;
        }arr[rear]=data;
        System.out.println("Enqueued: "+data+" into the queue");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }else if(front==rear){
            front=rear=-1;
        }else{
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }return arr[front];
    }
    public int getRear(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }return arr[rear];
    }
    public int getSize(){
        if(isEmpty())
            return 0;
        else{
            return rear-front+1;
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerQueue queue=new IntegerQueue();
        int[] arr={1,2,3,4,5,6,7,8};
        for(int x:arr){
            queue.enqueue(x);
        }
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
    }
}
