package dsa.dataStructure.Linear.stack;

public class IntegerStack {
    int[] a;
    int top;
    int capacity;
    IntegerStack(int size){
        capacity=size;
        a=new int[size];//Stack of integers
        top=-1;
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("Stack overflow");
        }
        a[++top]=x;
        System.out.println("Added "+x+" to the top of the stack.");
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }return a[top--];
    }
    void display(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        System.out.print("Stack Elements: ");
        for(int i=top;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }return a[top];
    }

    public static void main(String[] args) {
        IntegerStack stack=new IntegerStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Popped: "+stack.pop());
        System.out.println("Top element: "+stack.peek());
        stack.display();
        System.out.println("Stack size: "+(stack.top+1));
    }
}
