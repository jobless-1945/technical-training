package garbageCollection;

public class GCExample {
    public static void main(String[] args) {
        String s1=new String("Java");
        String s2=new String("Python");
        s1=s2;
        System.gc();//Not mandatory
        //Now in the string pool, java is not available
        //That proves tht Garbage collection is automatic
        System.out.println(s1);
    }
}
