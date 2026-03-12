package dsa.algos.searching;

public class BinarySearch {
    static int BinarySearch(int[] a,int key){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==key){
                return mid;
            } else if (a[mid]<key) {
                s=mid+1;//go to the right side to find the key
            }else{
                e=mid-1;//go to the left side to find the key
            }
        }return -1;//If key was not found,return an invalid index
    }

    public static void main(String[] args) {
        int[] a={2,3,5,6,9,15};
        int key=5;
        int ind=BinarySearch(a,key);
        if(ind!=-1){
            System.out.println(key+" is present in the index "+ind);
        }else{
            System.out.println(key+" is not present");
        }
    }
}
