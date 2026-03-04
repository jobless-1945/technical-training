package ExceptionHandling;

public class ThrowableDem {
    static void test() throws Throwable {
            throw new Throwable("Something happened");
    }
    public static void main(String[] args) {
        try {
           test();
        }catch (Throwable t){
            //Fully qualified name
            System.out.println("Handled: "+t);
            //message
            System.out.println("Handled: "+t.getMessage());
        }
    }
}
/*
throw new string("error");❎
throw new integer("error");❎
throw new exception("error");✅
throw new runtimeexception("error");✅(●'◡'●)
 */
