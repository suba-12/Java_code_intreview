package Curious.Arrays;

import java.util.Arrays;

public class Thirdlargest {
    public static void main(String[] args) {
        int[] arr = {12,2,3,34,35,67,100};
       // largest(arr);

        System.out.println(findThirdLargest(arr));
        
       
    }



    static void largest(int[] arr){
        int n = arr.length;
       // int[] max = new int[n];

         int first =arr[0];

        for (int index = 0; index < arr.length; index++) {
            if(first <= arr[index]){
                first = arr[index];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {

            if(second < arr[index] && first > arr[index]){
                second = arr[index];
            }
        }
  int third = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {

            if(third < arr[index] && second > arr[index]){
                third= arr[index];
            }
        }


      System.out.println(third);

         

    }



     static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array length should be at least 3");
            return -1; // or handle this case according to your requirements
        }

        // Sort the array in ascending order
       // Arrays.sort(arr);
       Arrays.sort(arr);

        // The third largest element will be the third from the end
        return arr[arr.length - 3];
    }
}


