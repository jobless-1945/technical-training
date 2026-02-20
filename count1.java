package day2;
import java.util.*;
public class count1 {
    static int c;
    static int count(int n){
        while(n!=0){
            if((n&1)==1){
                c++;
            }n=n>>1;
        }return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        count(n);
        System.out.println(c);
    }
}
