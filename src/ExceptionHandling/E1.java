package ExceptionHandling;
public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=10;
        try{
            k=i/j;
            int[] a={1,2,3,4};
            System.out.println(a[10]);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by 0");
            e.printStackTrace();//This provides details
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index invalid");
        }catch (Exception e){
            System.out.println("Something unexpected happened");
        }finally {
            System.out.println("End of execution");
            System.out.println("Turn off Db");
            System.out.println("Turn off files");
            System.out.println("Turn off Internet");
        }
        System.out.println("The value of k: "+k);
    }
    static {
        System.out.println("Start Execution");
        System.out.println("Load Db");
        System.out.println("Load files");
        System.out.println("Load Internet");
    }
}
