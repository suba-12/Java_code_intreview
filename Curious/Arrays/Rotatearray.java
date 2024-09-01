package Curious.Arrays;

import java.util.Arrays;

/*
 Input: arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}

Input: arr[] = {2, 3, 4, 5, 1}
Output: {1, 2, 3, 4, 5}
 */
public class Rotatearray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 1;
        // iteration(k ,arr);
        rotate(arr, k);

        System.out.println(Arrays.toString(arr));

    }
    static void rotate(int[] arr, int k) {

        for (int i = 0; i < k; i++) {
            int last = arr[arr.length - 1]; // 5

            for (int index = arr.length - 1; index > 0; index--) {  // 4 , // arr[4 ] = arr[4-1] = 4 
                arr[index] = arr[index - 1];  // 5,1,2,3,4

            }
            arr[0] = last;
        }
        // System.out.println(max);

        // System.out.println(max);

    }
}

/*
     * static void iteration(int k , int[] arr){
     * 
     * 
     * for (int index = 0; index < k; index++) {
     * rotate(arr);
     * Arrays.toString(arr);
     * }
     * System.out.println(arr);
     * 
     * 
     * }
     */