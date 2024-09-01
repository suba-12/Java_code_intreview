package Curious.Arrays;

import java.util.Arrays;

import WIPRO.forint;

/*
Input: [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
 */
public class Zeroshift {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        shift(arr);
        System.out.println(Arrays.toString(arr));
        //or
        /*
           for (int num : arr) {
            System.out.print(num + " ");
        }
         */

    }
    static void shift(int[] arr ){
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != 0){
                arr[count++]= arr[index];
            }           
            
        }
        while(count < arr.length){
            arr[count++] = 0;
        }


       // return 1 ;

    }
}
