package technical.training.pali;
import java.util.*;
public class pal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int pal=0;
        int b;
        while(temp!=0){
            b=temp%10;
            pal=pal*10+b;
            temp=temp/10;
        }
        if(pal==a){
        System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
