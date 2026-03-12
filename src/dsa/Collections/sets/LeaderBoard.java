package dsa.Collections.sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores=new TreeSet<>(Comparator.reverseOrder());
        //Normally Ascending Order
        scores.add(450);
        scores.add(200);
        scores.add(120);
        scores.add(320);
        scores.add(125);
        scores.add(197);
        System.out.println("Scores: "+scores);
    }
}
