package dsa.Collections.maps;

import java.util.HashMap;

public class FrequencyMap {
    public static void main(String[] args) {
        int[] a={1,2,2,3,1,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:a){
            //{1=0,2=0,3=0,4=0} => {1=2,2=2,3=1,4=1}
            map.put(num, map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        System.out.println(map.get(2));
    }
}
