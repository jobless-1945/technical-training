package arrays.arrayProblems;

public class MissingNumber {
    public static int missingNum(int[] a){
        int n=a.length+1;
        int totalSum=(n*(n+1))/2;
        int arraySum=0;
        for(int i=0;i<a.length;i++){
            arraySum+=a[i];
        }
        return totalSum-arraySum;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4
        };
        System.out.println(missingNum(a));
    }
}
