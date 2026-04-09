package dsa.dataStructure.Linear.queue;

public class SlidingWindowBruteForce {
    public static void main(String[] args) {
        /*
        Total windows Formula: n-k+1 => 8-3+1=6
        Total Windows = total length - window size + 1
         */
        int[] a={1,3,-1,-3,5,3,6,7};
        int k=3;
        for(int i=0;i<=a.length-k;i++){//0 to 8-k(3)=5 (0-5) 6 windows
            int max=a[i];
            for(int j=i;j<i+k;j++){
                if(a[j]>max){
                    max=a[j];
                }
            }
            System.out.print(max+" ");
        }
    }
}
