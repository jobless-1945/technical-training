package arrays;

public class E1 {
    public static void main(String[] args) {
        int[] a;//Declaration
        a=new int[5];//Memory Allocation[20 bytes(5*4)]
        //Decalration + memory allocation in the single line
        //If we dont provide value
        //the jvm uses "Fallback mechanism"
        //It uses the default value of that data type
        //Method 2
        int[] arr2 = new int[5];
        System.out.println(arr2[4]);
        System.out.println(a[3]);
        //method 3
        int[] a3={1,2,3,4,5};
        //method 4
        int[] a4=new int[]{1,2,3,4,5};
    }
}
