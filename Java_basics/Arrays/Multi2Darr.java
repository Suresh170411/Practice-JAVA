package Java_basics.Arrays;

import java.util.Arrays;

public class Multi2Darr {
    public static void main(String[] args) {
        
        int [][] matrix = new int [2][2];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        int [][] mat = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        
        // ================ FOR LOOPS ===================

        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        for (int [] row : mat){
            for (int col : row){
                System.out.print(col);      // ENHANCHED FOR LOOP FOR 2D array
            }
            System.out.println();
        }
    }
}
