package Traning;

import java.util.Arrays;

public class Maxin2d {
    public static void main(String[] args) {
        int[][] arr = {{1,20,3},
                        {4,50,6},
                          {3,5}};
        max(arr);
        maxrow(arr);
    }

    // max val in col
    static void max(int[][] arr){
        int max = arr[0][0];
        int[] mat = new int[arr.length];

            for (int j = 0; j < arr.length; j++) {
                for (int index = 0; index < arr[j].length; index++) {

             if(max < arr[index][j]){
                max = arr[index][j];
             }
            }  
            mat[j] = max;
            max = 0;          
        }
        System.out.print(Arrays.toString(mat));

    }


    // max val in row
    static void maxrow(int[][] arr){
        int max = arr[0][0];
        int[] mat = new int[arr.length];

                for (int index = 0; index < arr.length; index++) {
                    for (int j = 0; j < arr[index].length; j++) {


             if(max < arr[index][j]){
                max = arr[index][j];
             }
            }  
            mat[index] = max;
            max = 0;          
        }
        System.out.print(Arrays.toString(mat));

    }
}
