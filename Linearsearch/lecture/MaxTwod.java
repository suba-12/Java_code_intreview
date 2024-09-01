package Linearsearch.lecture;

import java.util.Arrays;

public class MaxTwod {
    public static void main(String[] args) {
        int[][] arr = {
            {23,3,4},
            {34,45,56},
            {23,34,2}
        };
        int target = 34;
       
        System.out.println(Maximun(arr));
    
    }
    static int Maximun(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] valu : arr) {
            for (int element :valu ) {
                if(max < element){
                    max = element ;
                }
            }
            
        }
        return max;

    }
}
