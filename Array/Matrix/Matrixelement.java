package Array.Matrix;

import java.util.Arrays;

public class Matrixelement {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {12,34,45},
            {45,56,34},
            {23,34,56}
    };
    int[][] matrix2 = {
        {12,34,45},
        {45,526,34},
        {23,34,536}
};
      int m = 3;
      int n = 3;
      int[][] res = new int[m][n] ;
      
        
      // Print the resulting matrix
      System.out.print(Arrays.deepToString(add(matrix1, matrix2, res)));
    }
    static int[][] add(int[][] matrix1,int[][] matrix2 ,int[][] res){

      for (int index = 0; index < matrix1.length; index++) {
        for (int col = 0; col < matrix1[index].length; col++) {
             res[index][col] = matrix1[index][col] + matrix2[index][col];
        }
        
      }
      return res;
    }
}
