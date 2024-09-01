package Arraystest;

import java.util.Arrays;

/*
Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

 */
public class Dutchnational {
    public static void main(String[] args) {
        int[] arr =  {0, 1, 2, 0, 1, 2};
        int[] ans = dutuch(arr);
        System.out.println(Arrays.toString(ans));


    }

    
    static int[] dutuch(int[] arr){
        int n = arr.length;
        int[] res = new int[n];

        for (int index = 0; index < arr.length; index++) {
            res[arr[index]]++;
        }
        System.out.println(Arrays.toString(res));



        
     
       return res;    

    }


}

