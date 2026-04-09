package dsa.dataStructure.Linear.LinkedList.Problems.ReverseList;

import java.util.Scanner;

public class EvenOdd {
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
    static void printEven(){
        Node temp;
        temp=head;
        while(temp.next!=null){
            if(temp.data%2==0){
                System.out.println("Even "+temp.data);
            }temp=temp.next;
        }
    }
    static void printOdd(){
        Node temp=head;
        while (temp!=null) {
            if (temp.data % 2 != 0) {
                System.out.println("Odd "+ temp.data);
            }temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of nodes: ");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" nodes: ");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        printEven();
        printOdd();
    }
}
