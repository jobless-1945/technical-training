package technical.training;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int count=0,b=0;
        int sum=0;
        while(temp!=0){
        temp=temp/10;
        count++;
        }
        temp=a;
        while(temp!=0){
            b=temp%10;
            sum+=Math.pow(b, count);
            temp=temp/10;
        }
        if(a==sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not");
        }
    }
}