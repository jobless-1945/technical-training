package day2;
import java.util.*;
public class automorpic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        int temp=n;
        while(temp>0){
        if(temp%10!=s%10){
            System.out.println(" it is not Automorphic");
            return;
        }
        temp=temp/10;
        s=s/10;
        }System.out.println("Automorphic");
    }
}
