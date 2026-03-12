package dsa.algos.searching.binarySearchApplication;

public class FirstLastTotalOcc {
    public static int firstOcc(int[] a,int key){
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==key){
                //Store the ans and move to extreme left for first occ
                ans=mid;
                e=mid-1;
            }else if (a[mid]<key){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }return ans;
    }
    public static int lastOcc(int[] a,int key){
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==key){
                //Store the ans and move to extreme right for first occ
                ans=mid;
                s=mid+1;
            }else if (a[mid]<key){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }return ans;
        }
    public static int totalOcc(int[] a,int key){
        int f0=firstOcc(a,key);
        int lo=lastOcc(a,key);
        return lo-f0+1;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,3,3,4,5,6};
        int f=firstOcc(a,3);
        int l=lastOcc(a,3);
        int t=totalOcc(a,3);
        System.out.println("First Occurrence Index: "+f);
        System.out.println("Last Occurrence Index: "+l);
        System.out.println("Total Occurrence Index: "+t);
    }
}
