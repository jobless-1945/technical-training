package Day2.memberInnerClass;

import java.time.LocalDate;

public class Exam {
    void evaluate(int marks){
        //local inner class
        class GradeCalculator{
            String calculate(){
                if(marks>=75) return "Distinction";
                else if (marks>=60) return "First Class";
                else return "Pass";
            }
        }
        GradeCalculator gc=new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamDate(){
        LocalDate d=LocalDate.now().plusDays(2);
        System.out.println("The exam date is: "+d);
    }

    public static void main(String[] args) {
        Exam e=new Exam();
        e.evaluate(67);
        e.evaluate(89);
        e.displayExamDate();
    }
}
/*
ℹ️Points to remember
💠Grade logic is scoped to the "evaluate" method
💠It avoids polluting the class with helper methods
💠It helps in designing the codebase in a cleaner way
 */