package arrays.arrayProblems;

public class ArrayPartitioning {
    public static void main(String[] args) {
        int[] a={3,8,5,12,7,6};
        int l=0;
        int r=a.length-1;
        while(l<r){
            while(a[l]%2==0){
                l++;//If left is even no. then move right
            }while(a[r]%2!=0){
                r--;//If right is odd no. move left
            }
            if(l<r){//if the no. & sides dont match,swap
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
            }
        }for(int x:a){
            System.out.print(x+" ");
        }
    }
}
