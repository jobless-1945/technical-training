package dsa.algos.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumberOfCoins {
    static void findMinimumCoins(List<Integer> coins,int V){
        List<Integer> result=new ArrayList<>();
        //If the array is not sorted,sort it first
        for(int i=coins.size()-1;i>=0;i--){
            while(V>=coins.get(i)){
                V-=coins.get(i);
                result.add(coins.get(i)); //Add coin to result
            }
        }
        System.out.println("Coins selected: ");
        for(int coin:result){
            System.out.print(coin+" ");
        }
        System.out.println();
        System.out.println("Minimum coins selected: "+result.size());
    }

    static void main(String[] args) {
        List<Integer> coins= Arrays.asList(1,2,5,10,20,50,100,200,500);
        int v1=91;
        findMinimumCoins(coins,v1);
        int v2=31;
        findMinimumCoins(coins,v2);
        int v3=55;
        findMinimumCoins(coins,v3);
    }
}
