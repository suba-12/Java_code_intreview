
package Binarysearch;

import java.util.Arrays;

public class Twodbinary {
    public static void main(String[] args) {
        int[][] matrix = {
            {10,20,30,35},
            {40,5,60,65},
            {70,80,90,95},
            {99,100,11,12}
        };
        int target = 12;
        System.out.println(Arrays.toString(Twod(matrix, target)));

    }
    static int[] Twod(int[][] matrix ,int target ){
        int row = 0;
        int col = matrix.length -1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row ,col};
            }
            else if ( matrix[row][col]< target){
                row++;
            }else{
                col--;
            }
        }
   

        return new int[] {-1,-1};
    }
}
