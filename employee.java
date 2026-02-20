package day2;
import java.util.*;
public class employee {
    int id;
    String name;
    double sal;
    employee(int i,String n,double s){
            id=i;
            name=n;
            sal=s;
    }
    void display(){
        System.out.println("id:"+id+" name:"+name+" salary:"+sal);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i1=sc.nextInt();
        String n1=sc.next();
        double s1=sc.nextDouble();
        int i2=sc.nextInt();
        String n2=sc.next();
        double s2=sc.nextDouble();
        employee e1=new employee(i1,n1,s1);
        employee e2=new employee(i2,n2,s2);
        e1.display();
        e2.display();
    }
}