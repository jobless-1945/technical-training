package finalkeyword;

public final class Demo {
}
//class A extends Demo{
//} Cannot inherit
class B{
    final void clg(){
        System.out.println("snpsu");
    }
}
class C extends B{
   // void clg(){
    //
    //}Cannot override
    final int x=200;
    //x=400;
    //void show(final int x){
      //  x=30;}
}

