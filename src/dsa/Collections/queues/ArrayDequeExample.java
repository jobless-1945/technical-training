package dsa.Collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions=new ArrayDeque<>();
        actions.addLast("User type A");
        actions.addLast("User type B");
        actions.addLast("User delete B");
        System.out.println("Undo: "+actions.removeLast());
        System.out.println("Remaining action: "+actions);
    }
}