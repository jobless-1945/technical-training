package dsa.BitManipulation;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        if((n & n-1)==0)
        {
            System.out.println("Power of 2");
        }else System.out.println("Not a power of 2");
    }
}
