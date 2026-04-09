package dsa.dataStructure.Linear.LinkedList;
class LL{
    Node head;
    private int size;
    LL(){
        size=0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;//we don't know the address of the next node
            size++;//Increase the size as soon as the node is created
        }
    }
    public void display(){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+" --> ");
            cur=cur.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        //Create a new node
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        //Create a new node
        Node newNode=new Node(data);
        //Empty List
        if(head==null){
            head=newNode;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        //At the end of this loop, we will stand at the last node
        //Point the last node next pointer to the new node
        last.next=newNode;
    }
    public void removeFirst(){
        //Empty list cannot remove the head node.
        if(head==null){
            System.out.println("List is empty. Can't delete the head!");
            return;
        }
        //For a single node the head will point to the next(null)
        //For multiple nodes the head will point to the next(head.next)
        head=this.head.next;
        size--;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("List is empty. Can't delete the tail!");
            return;
        }
        //Single element in the list
        if(head.next==null){
            head=null;//C/C++ style of code
            size--;
            return;
        }
        //Multiple element in the list
        Node cur=head;
        Node last=cur.next;
        while(last.next!=null){
            cur=last;
            last=last.next;
        }
        //The last node will be cleared by the JVM if not used
        // So, we point the secondLast(cur) node to null pointer
        //For C/C++ we hv to write delete last as they don't hv garbage collector
        cur.next=null;
        size--;
    }
    public void removeTarget(String target){
        if(head==null){
            System.out.println("List is empty. Can't delete the target!");
            return;
        }
        //Case: target is the head node itself
        if(head.data.equals((target))){
            head=head.next;
            size--;
            return;
        }
        //Case:target is anywhere in the list
        Node prev=null;
        Node cur=head;
        while(cur!=null && !cur.data.equals(target)){
            prev=cur;
            cur=cur.next;
        }
        //Do a check to see if the curr pointer is null
        //if it's null, the target is not found
        if(cur==null){
            System.out.println(target+" Not found");
            return;
        }prev.next=cur.next;//Adjust the previous node and current node
        size--;
    }
    public static void main(String[] args) {
        LL sll= new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("We");
        sll.display();
        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SNPSU");
        sll.display();
        sll.removeFirst();
        sll.display();
        sll.removeLast();
        sll.display();
        sll.removeTarget("DSA");
        sll.display();
        sll.removeTarget("Python");
    }
}