package arrays;
class Student{
    String name;
    int usn;
}
class Intern{
    String name;
    int ID;
    Intern(String name,int ID){
        this.name=name;
        this.ID=ID;
    }
}
//Array of objects{Student Objects}
public class E7 {
    public static void main(String[] args) {
        Student[] stud=new Student[2];
        stud[0]=new Student();
        stud[0].name="Rahul";stud[0].usn=101;
        stud[1]=new Student();
        stud[1].name="vishal";stud[1].usn=102;
        System.out.println(stud[0].name+" "+stud[0].usn);
        Intern[] interns=new Intern[]{
                new Intern("Sahana", 100),
                new Intern("Ramya", 101),
                new Intern("Ragu", 102)
        };
        //The data type is the class itself
        for(Intern i:interns){
            System.out.println(i.name+" "+i.ID);
        }
        for (Student s: stud){
            System.out.println(s.name+" "+s.usn);
        }
    }
}
