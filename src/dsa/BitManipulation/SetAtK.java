package dsa.BitManipulation;

public class SetAtK {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        int res = n | (1 << k);
        System.out.println(res);
    }
}
