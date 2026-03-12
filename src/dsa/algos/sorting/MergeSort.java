package dsa.algos.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] a,int s,int mid,int e){
        //Sized of the two subarrays to be merged
        int n1=mid-s+1;
        int n2=e-mid;
        //Temporary arrays
        int[] L=new int[n1];
        int[] R=new int[n2];
        //Copy the data to the temporary arrays
        for(int i=0;i<n1;i++){
            L[i]=a[s+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=a[mid+1+j];
        }
        //Initial index of first and second subarrays
        int i=0,j=0;
        //Initial index of merged subarray
        int k=s;
        while(i<n1 && j<n2){
            if (L[i] <= R[j]) {
                a[k++]=L[i++];
            }else{
                a[k++]=R[j++];
            }
        }
        //Copy remaining elements from L[] if any
        while(i<n1){
            a[k++]=L[i++];
        }
        //Copy remaining elements from R[] if any
        while(j<n2){
            a[k++]=R[j++];
        }
    }
    public static void mergeSort(int[] a,int s,int e){
        if(s<e){
            //Find the middle point
            int mid=s+(e-s)/2;
            //Sort first and second halves
            mergeSort(a,s,mid);
            mergeSort(a,mid+1,e);
            //merge the sorted half into one
            merge(a,s,mid,e);
        }
    }

    public static void main(String[] args) {
        int[] a={5,2,4,1};
        mergeSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

}
