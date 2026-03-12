package dsa.algos.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] a){
        for (int i=0;i< a.length-1;i++){
            int minInd=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[minInd]){
                    minInd=j;
                }
            }if(minInd!=i){
                int temp=a[i];
                a[i]=a[minInd];
                a[minInd]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a={5,2,0,9,1,4};
        System.out.println(Arrays.toString(a));
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
