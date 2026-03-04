package arrays;

public class E2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(a[1]);
        a[1]=40;
        System.out.println(a[1]);
        //Access & update elements in an array -> TC O(1)
        //This is because of index-based access or
        //direct index-mapping
        //[idx=pos-1] or [pos=idx=pos+1]
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();
        for(Object o:a){
            System.out.print(o+" ");
        }
        System.out.println();
        String s="Java";
        System.out.println(s.length());
    }
}
/*
⭐array.length is a property
⭐string.length() is a method
ℹ️Memory management
💠Array object is stored in the heap
💠Variable references is stored in the stack
💠Elements are stored in contiguous memory blocks
🟢 char[1][1][1][1] int[4][4][4][4] double[8][8][8][8] bytes
 */