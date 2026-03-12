package dsa.algos.special;

public class KadaneAlgo {
    static int kadaneAlgo(int[] a){
        int cMax=a[0];
        int gMax=a[0];
        for(int i=1;i<a.length;i++){
            cMax=Math.max(a[i],cMax+a[i]);
            gMax=Math.max(cMax,gMax);
        }
        return gMax;
    }

    public static void main(String[] args) {
        int[] a={5,-8,1,2,-1,4};
        System.out.println(kadaneAlgo(a));
    }
}
//if for minimum just change max to min