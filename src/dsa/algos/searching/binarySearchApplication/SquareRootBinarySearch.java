package dsa.algos.searching.binarySearchApplication;

public class SquareRootBinarySearch {
    public static int sqrt_bs(int n){
        int s=0;
        int e=n;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int sq=mid*mid;
            if(sq==n){
                return mid;
            } else if (sq>n) {
                e=mid-1;//Go to the left hand side
            }else{
                //Store the probable answer & move to the rigth
                ans=mid;//The mid value is stored in the answer
                s=mid+1;//We move to the right to find accurate ans
            }
        }return ans;
    }

    public static void main(String[] args) {
        System.out.println(sqrt_bs(48));
    }
}
