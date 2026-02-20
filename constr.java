package day2;
import java.util.*;
public class constr {
    String nam;
    int age;
    constr(String nam,int age){
        this.nam=nam;
        this.age=age;
    }
    void display(){
        System.out.println(nam+" "+age);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nam=sc.next();
        int age=sc.nextInt();
        constr c1=new constr(nam,age);
        c1.nam=sc.next();
        c1.age=sc.nextInt();
        c1.display();
    }
}
