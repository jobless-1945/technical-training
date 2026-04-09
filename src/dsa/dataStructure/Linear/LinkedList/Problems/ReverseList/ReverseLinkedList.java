package dsa.dataStructure.Linear.LinkedList.Problems.ReverseList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class ReverseLinkedList {
    static Node head;
    static void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }temp.next=newNode;
    }
    static void reverse(){
        Node prev=null;
        Node cur=head;
        Node next;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }head=prev;
    }
    static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" nodes: ");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        System.out.println("Original List: ");
        display();
        reverse();
        System.out.println("Reversed List: ");
        display();
    }
}

