package Day2;
import java.util.*;
public class neon {
    public static boolean check(int n){
        int s=n*n;int sum=0;
        while(s!=0){
            int b=s%10;
            sum=sum+b;
            s=s/10;
        }return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n)){
            System.out.println("It is neon");
        }else{
            System.out.println("It is not");
        }
    }
}
