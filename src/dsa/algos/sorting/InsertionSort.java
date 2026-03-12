package dsa.algos.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] a){
        for (int i=1;i< a.length-1;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                //Shift operation
                a[j+1]=a[j];
                j--;//Create empty space[]by shifting
            }a[j+1]=temp;//Fill the space [] with the temp variable
        }
    }

    public static void main(String[] args) {
        int[] a={5,2,0,9,1,4};
        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
