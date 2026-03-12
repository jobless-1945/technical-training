package dsa.BitManipulation;

public class FindingTheValueOfRsb {
    public static void main(String[] args) {
        int n=12;//1100 =4
        int result=n & -n;
        System.out.println("RSB: "+result );
    }
}
