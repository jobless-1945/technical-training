package dsa.algos.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int partitionIndex(int[] a,int s,int e){
        int pivot=a[s];
        int count=0;
        for(int i=s+1;i<=e;i++){
            if(pivot>a[i]){
                count++;
            }
        }
        //Place the pivot at the correct position or index
        int pi=s+count;
        swap(a,pi,s);
        //Let's manage the left and right side of the pivot
        int i=s,j=e;
        while(i<pi && j>pi){
            while(a[i]<pivot){//if left is lesser than pivot then move to next index
                i++;
            }while(a[j]>pivot){//if right is greater than pivot then move to next index
                j++;
            }if(i<pi && j>pi)
                swap(a,i++,j--);
        }return pi;
    }
    public static void quickSort(int[] a,int s,int e){
        //base case
        //if single element or OutOfBound
        if(s>=e){
            return;
        }
        //find the pivot for the partition if the array
        int p=partitionIndex(a,s,e);
        //now we take recursion to sort the lhs and rhs
        //Left part
        quickSort(a,s,p-1);
        //Right part
        quickSort(a,p+1,e);
    }

    public static void main(String[] args) {
        int[] a={5,6,2,8,9,3};
        int n=a.length;
        quickSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
