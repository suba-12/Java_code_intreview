package Array.Assignment;

import java.util.Arrays;

//Input: digits = [1,2,3]
//Output: [1,2,4]


//Input: digits = [9]
//Output: [1,0]


public class Plusone66 {
    public static void main(String[] args) {
      int[] arr = {1,2,3};
       // int[] arr = {9,9,9};
       System.out.println(Arrays.toString(plusone(arr)));
    }

   static int[] plusone(int[] arr ){
      for (int index = arr.length - 1; index  >= 0; index--) {

        if( arr[index] < 9){
            arr[index]++;
        return arr;

        }
        arr[index] =0;
   }
   arr =  new int[arr.length +1];
   arr[0] =1;
   return arr;

   }
   
}

/* static int plusone(int[] arr ){
    int sum = 0;
    int k = 1;

    int n = arr.length;

      for (int index = 0; index < arr.length; index++) {
        sum = sum * 10 + arr[index];
      }
      return sum+k;
   } */