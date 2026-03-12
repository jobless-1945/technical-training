package dsa.BitManipulation;

public class CheckAtk {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        if((n&(1<<k))!=0){
            System.out.println("Bit is set");
        }else System.out.println("Bit is not set");
    }
}
