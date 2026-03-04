package strings;

public class StringUseCase {
    public static void main(String[] args) {
        String msg="Order confirmed";
        msg=msg+" -ID: 101";
        System.out.println(msg);
        //msg=msg+" -ID: 102";
        //System.out.println();
    }
}
/*
String is Immutable
Stored in SCP String constant Pool
Every modification creates a  new object
Good for read-only data
 */