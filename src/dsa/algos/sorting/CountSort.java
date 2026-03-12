package dsa.algos.sorting;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] a){
        //Step 1:FInd the max
        int k=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>k){
                k=a[i];
            }
        }
        //Step 2: Create a count array[0-max]
        int[] count =new int[k+1];
        //Step 3: Calculate the frequency of each element in the array
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }//Step 4: Calculate the cummulative count
        //Skip index 0 and start from 1 till max[k]
        for(int i=1;i<=k;i++){
            count[i]+=count[i-1];
        }
        //Step 5: Create the output array
        int[] output=new int[a.length];
        //Step 6: Start from end of the array (l<-r)
        for(int i=a.length-1;i>=0;i--){
            output[--count[a[i]]]=a[i];
        }
        //Copy the output back to input
        System.arraycopy(output,0,a,0,a.length);
    }

    public static void main(String[] args) {
        int[] a={1,3,2,3,4,1,6,4,3};
        System.out.println(Arrays.toString(a));
        countSort(a);
        System.out.println(Arrays.toString(a));
    }
}
