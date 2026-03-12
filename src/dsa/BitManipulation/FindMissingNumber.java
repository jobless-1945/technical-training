package dsa.BitManipulation;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] a={1,2,4,5};
        int n= a.length+1;
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=n;i++){
            xor1 ^=i;//1^2^3^4^5
        }
        for(int num:a){
            xor2 ^=num;//1^2^4^5
        }
        int missing=xor1^xor2;//(1^2^3^4^5) ^(1^2^4^5)
        System.out.println(missing);
    }
}
