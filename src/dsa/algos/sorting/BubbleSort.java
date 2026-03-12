package dsa.algos.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] a){
        int n=a.length;
        for(int i=1;i<n;i++){//n to n-1
            for(int j=0;j<n-i;j++){//go till the second last to compare with the last element
                if(a[j]>a[j+1]) {
                    //swap a[j] and a[j+1}
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a={2,10,4,5,1,9};
        System.out.println(Arrays.toString(a));
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
