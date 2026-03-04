package Day2;
import java.util.*;
public class stroMeth {
    int fact(int b){
        int f=1;
        for(int i=1;i<=b;i++){
            f*=i;
        }return f;
    }
    boolean check(int a){
        int temp=a;
        int sum=0;
        while(temp!=0){
            int b=temp%10;
            sum=sum+fact(b);
            temp=temp/10;
        }
        return sum==a;
    }
    public static void main(String[] args) {
        stroMeth s1=new stroMeth();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(s1.check(a)){
            System.out.println("strong no");
        }else{
            System.out.println("not a strong no.");
        }
    }
}
