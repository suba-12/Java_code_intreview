package Linearsearch.lecture;

import java.util.Arrays;

public class Twodarray {
   public static void main(String[] args) {
    int[][] arr = {
        {123,34,45,3},
        {34,5,3,6},
        {8,4,5},
        {7,9}     
    };
    int target = 34;
    int[] ans = Twosearch(arr,target);
    System.out.println(Arrays.toString(ans));
   }
    static int[] Twosearch(int[][] arr,int target){
        for(int row = 0;row < arr.length;row++){
            for(int col=0 ;col < arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
   } 

