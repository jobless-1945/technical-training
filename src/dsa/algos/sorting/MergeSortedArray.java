package dsa.algos.sorting;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a1={1,3,5,7,9};
        int[] a2={2,4,6};
        int[] merged=mergeSortedArray(a1,a2);
        System.out.println("Merged array: "+ Arrays.toString(merged));
    }
    public static int[] mergeSortedArray(int[] a1,int[] a2){
        int i=0,j=0,k=0;
        int n1= a1.length;
        int n2= a2.length;
        int[] merged=new int[n1+n2];
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                merged[k++]=a1[i++];
            }else{
                merged[k++]=a2[j++];
            }
        }
        //Check if there are any remaining elements into the final array
        while(i<n1){
            merged[k++]=a1[i++];
        }
        while(j<n2){
            merged[k++]=a2[j++];
        }
        return merged;
    }
}