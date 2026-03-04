package technical.training;
import java.util.*;
public class TechnicalTraining {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        if(a!=0){
        while(a!=0){
        a=a/10;
        count++;
        }
        System.out.println(count);
        }
        else{
            System.out.println("1");
        }
    }
    
}
