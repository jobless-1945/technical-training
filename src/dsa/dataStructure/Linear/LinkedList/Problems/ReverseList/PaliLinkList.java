package dsa.dataStructure.Linear.LinkedList.Problems.ReverseList;

import java.util.Stack;
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
public class PaliLinkList {
        public static boolean isPalindrome(ListNode head) {
            Stack<Integer> s = new Stack<>();
            ListNode temp = head;
            //Traverse the list first to push all elements into the stack
            while (temp != null) {
                s.push(temp.data);
                temp = temp.next;
            }
            temp = head;
            //Now compare the nodes with the stack top elements
            while (temp != null) {
                if (temp.data != s.pop()) {
                    return false;
                }temp=temp.next;
            }return true;
            //All the nodes have been checked if its a palindrome
        }

    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(1);
        System.out.println(isPalindrome(head1)?"Palindrome":"Not palindrome");
        ListNode head2=new ListNode(1);
        head2.next=new ListNode(2);
        head2.next.next=new ListNode(3);
        System.out.println(isPalindrome(head2)?"Palindrome":"Not palindrome");
    }
}
