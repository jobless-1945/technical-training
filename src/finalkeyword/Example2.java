package finalkeyword;

public class Example2 {
    {
        System.out.println("IIB-1");//IIB-Instance initialiser block
    }
    final int x;
    static final int y;
    Example2(){
        x=200;
    }

    public static void main(String[] args) {
        new Example2();
    }
    static {
        y=10;
        System.out.println("Start");
    }{
        System.out.println("IIb-2");
    }

}
//if final variable is not initialised it can be initialised in the constructor