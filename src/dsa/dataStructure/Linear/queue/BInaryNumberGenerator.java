package dsa.dataStructure.Linear.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BInaryNumberGenerator {
    public static void generateBinaryNumbers1toN(int N){
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        while(N-- >0){
            String cur=q.poll();
            System.out.print(cur+" ");//Print the latest
            q.offer(cur+'0');//Concatenate 0 & push to queue
            q.offer(cur+'1');//Concatenate 1 & push to queue
        } System.out.println();
    }

    public static void main(String[] args) {
        int N=5;
        generateBinaryNumbers1toN(N);
    }
}
