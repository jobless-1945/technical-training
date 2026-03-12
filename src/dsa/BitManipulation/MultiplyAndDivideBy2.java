package dsa.BitManipulation;

public class MultiplyAndDivideBy2 {
    public static void main(String[] args) {
        int n=5; //0101 << 1=1010 multiply by 2
        int res=n<<1;
        System.out.println(res);
        int x=5;
        int r=x>>1;//divide by 2 0101>> 0010
        System.out.println(r);
    }
}
