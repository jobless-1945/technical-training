package dsa.dataStructure.NonLinear.Heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity=new PriorityQueue<>();
        //1 -> High Priority
        //3 -> Medium Priority
        //5 -> Low Priority
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("The patient that gets operated first is patient "+severity.poll());
        System.out.println("Patient in queue: "+severity);
    }
}
