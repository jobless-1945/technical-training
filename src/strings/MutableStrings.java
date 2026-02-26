package strings;

public class MutableStrings {
    public static void main(String[] args) {
        //Mutable - Thread Safe
        StringBuffer sb=new StringBuffer("SNPSU");
        sb.append(" ISE");
        //Mutable - Not Thread Safe
        StringBuilder sbu=new StringBuilder("SNPSU");
        sbu.append("  ISE") ;
        System.out.println(sb);
        System.out.println(sbu);
    }
}
