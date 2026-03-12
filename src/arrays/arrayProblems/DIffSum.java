package arrays.arrayProblems;

public class DIffSum {
    public static void main(String[] args) {
        int n=5;
        int[] d=new int[n];
        int l=1;
        int r=3;
        int val=10;
        d[l]+=val;//0 10 0 0 0
        if((r+1)<n){
            d[r+1]-=val;//0 10 0 0 -10
        }int[] res=new int[n];
        res[0]=d[0];
        for(int i=l;i<d.length;i++){
            res[i]=res[i-1]+d[i];
        }for (int x:res){
            System.out.print(x+" ");
        }
    }
}
