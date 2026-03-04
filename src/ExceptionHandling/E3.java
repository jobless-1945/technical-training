package ExceptionHandling;
public class E3 {
    static void checkAge(int a){
        if(a>=18){
            System.out.println("Eligible");
        }else{
            throw new RuntimeException("Not eligible");
        }
    }
    public static void main(String[] args) {
        checkAge(16);
    }
}
