package arrays;

public class E3 {
    public static void main(String[] args) {
        //types
        int[] a={1,2,3,4,5};
        //2D Array -> Array of arrays - matrix
        int[][] matrix={{1,2,3},//row 1
                        {1,2,3},//row 2
                        {1,2,3}};//row 3[3x3] square matrix
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        //Jagged Array
        //In a 2D array if the row length is not same
        int[][] jagged={
                {1,2,3,4,5},
                {1,2,3},
                {1}
        };
        System.out.println(jagged[0].length);
        System.out.println(jagged[1].length);
        System.out.println(jagged[2].length);
        //array.length=rows, array[rows].length=column
        for(int r=0;r< jagged.length;r++){
            for (int c=0;c<jagged[r].length;c++){
                System.out.print(jagged[r][c]+" ");
            }
            System.out.println();
        }
        for(int[] ar: jagged){
            for(int x: ar){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        char[][] names={
                {'S','N','E','H','A'},
                {'S','I','D','H','A','R','T','H'},
                {'S','H','A','L','U'}
        };
        for(char[] c:names){
            for(char x:c){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
