package dsa.Collections.sets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4,5,6,6,7,8,8};
        System.out.println(Arrays.toString(arr));
        Set<Integer> uEle=new HashSet<>();
        for(int x:arr){
            uEle.add(x);
        }
        System.out.println(uEle);
        Set<Integer> ex=new HashSet<>();
        ex.addAll(Arrays.asList(1,2,3,4,4,5,5,6,6,7,7));
        System.out.println(ex);
    }
}