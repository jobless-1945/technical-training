package dsa.Collections.base.LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;

class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> stud=new ArrayList<>();
        stud.add(new Student(101,"Rahul"));
        stud.add(new Student(102,"Amit"));
        stud.add(new Student(100,"Amay"));
        for(Student s:stud){
            System.out.println(s.id+" "+s.name);
        }
        //Ascending order based on id
        stud.sort((s1,s2)->s1.id-s2.id);
        for(Student s:stud){
            System.out.println(s.id+" "+s.name);
        }
    }
}
