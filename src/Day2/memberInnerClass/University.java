package Day2.memberInnerClass;

public class University {
    static class Admission{
        static boolean isEligi(int marks){
            return marks>=60;
        }
    }

    public static void main(String[] args) {
        boolean result=University.Admission.isEligi(45);
        System.out.println(result);
        boolean result2=University.Admission.isEligi(65);
        System.out.println(result2);
    }
}
/*
ℹ️Points to remember
💠No university object needed - No heap memory needed.
💠logical grouping of data - improves readability
💠Similar to creating utility-helper classes
 */