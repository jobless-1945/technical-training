package strings;
//String is immutable-we cannot change it, we can create copies
//concat method creates a new object so the result is ignored
public class Ex2 {
    public static void main(String[] args) {
        String s="Java ";
        String n=s.concat("Programming");
        System.out.println(n);
    }
}
