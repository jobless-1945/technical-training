package arrays.arrayProblems;

public class SparseMatrix {
    public static void main(String[] args) {
        int[][] a={{1,0,0},
                {0,2,0},
                {0,3,0}};
        int row=a.length;//Only for square matrix
        int col=a[0].length;
        int CountZ=0;
        int NonZ=0;
        //Traversing the matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(a[i][j]==0)
                    CountZ++;
                else NonZ++;
            }
        }
        System.out.println("Zeros: "+CountZ);
        System.out.println("Non zero: "+NonZ);
        System.out.println(CountZ>NonZ?"Sparse":"Non Sparse");
        /*
        for(int[] b:a){
            for(int x:b){
                if(x==0)
                    CountZ++;
                else NonZ++;
            }
        }
            System.out.println(CountZ>NonZ?"Sparse":"Non Sparse");

         */
    }
}
