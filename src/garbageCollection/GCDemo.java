package garbageCollection;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj=new GCDemo();
        obj=null;
        System.gc();
        //Now a days the gc() method is automatically invoked after program execution by the object class
        //for clutter, garbage collection & removal by the jvm
        //we donot need to call it explicitly
        System.out.println("GC Requested");
    }
}
