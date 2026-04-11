package dsa.algos.dynamicProgramming.oneD;

import java.util.Arrays;

public class FibonacciMemoisation {
    public static int fib(int n,int[] dp){
        //Base case
        if(n<=1) return n;
        //Step 2: If you have the value dont calculate, just return
        if(dp[n]!=-1){
            return dp[n];
        }
        //Step 3: If you dont know the value, calculate the answer
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }

    static void main(String[] args) {
        int n=6;
        //Step 1: Create a 10 dp table of size n+1 (0-based
        int[] dp=new int[n+1]; //0-based indexing
        //sub-step of 1: Fill the array with default value -1
        Arrays.fill(dp,-1);
        System.out.println("Fibonacci at index "+n+" is: "+fib(n,dp));
    }
}
