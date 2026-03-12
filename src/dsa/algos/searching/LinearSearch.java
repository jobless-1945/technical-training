package dsa.algos.searching;

public class LinearSearch {
    static int LinearSearch(int[] a,int target){
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                return i;//if target found return the index
            }
        }return -1;//if target not found return -1
    }

    public static void main(String[] args) {
        int[] a={1,10,25,40,31,20};
        System.out.println(LinearSearch(a,20));
        System.out.println(LinearSearch(a,5));
    }
}
