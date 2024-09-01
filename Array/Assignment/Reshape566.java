package Array.Assignment;

import java.util.Arrays;

//Input: mat = [[1,2],[3,4]], r = 1, c = 4
//Output: [[1,2,3,4]]

public class Reshape566 {
   public static void main(String[] args) {
    int[][] mat = {
        {1,2,3,6},
        {3,4,4,5}
    };
    int r = 4;
    int c = 2;
    System.out.println("Reshaped Matrix 1: " + Arrays.deepToString(matrixReshape(mat, r, c)));
} 


    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; // 2
        int n = mat[0].length; // 4
       // System.out.print(m +" "+n);

        int[][] reshape = new int[r][c]; //reshape[4][2]
        
        int row = 0;
        int col = 0;

        //edge case 
        if(m*n != r*c){  // 4*2 == 2*4
            return mat;
        }
        //condition
        for(int i =0;i < m;i++){
            for(int j = 0;j < n ; j++){
                reshape[row][col] = mat[i][j];  // reshape [0][0] = mat[0][0] ==> (1)
                col ++;                        //  [[1, 0], [0, 0], [0, 0], [0, 0]]
                if(col == c){                 // 1 != 2
                    col =0;
                    row++;

                }
            }
        }
        return reshape;
    
    }
}

