package dsa.dataStructure.Linear.stack;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[] a=new String[MAX_SIZE];
    private int top=-1;//Stack is initially empty
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }
    public void push(String data){
        if(isFull()){
            System.out.println("Stack Overflow. Can't add more elements.");
            return;
        }
        a[++top]=data;
        System.out.println("The String: "+data+" was pushed to stack.");
    }
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow. Can't remove the top.");
            return null;
        }
        return a[top--];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack Overflow. Can't display.");
        }
        System.out.println("The Stack elements in order [LIFO] are: ");
        for(int i=top;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public int size(){
        return top+1;
    }
    public String peek(){
        //Intention is to fetch the top element and not to delete it
        if(isEmpty()){
            System.out.println("Stack Underflow. Can't retrieve top.");
            return null;
        }
        return a[top];
    }
    public static void main(String[] args) {
        StringStack ss=new StringStack();
        ss.pop();
        ss.push("Java");
        ss.push("Python");
        ss.push("C++");
        ss.display();
        System.out.println("Top element: "+ss.peek());
        System.out.println("Popped element: "+ss.pop());
        ss.display();
        System.out.println("Size of stack: "+ss.size());
    }
}
