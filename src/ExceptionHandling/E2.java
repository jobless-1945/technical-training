package ExceptionHandling;
public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try {
            k=i/j;
            int[] a={1,2,3,4};
            System.out.println(a[9]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
        }
        System.out.println(k);
    }
}
