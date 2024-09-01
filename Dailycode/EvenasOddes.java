package Dailycode;

import java.util.Arrays;

public class EvenasOddes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,67};
        order(arr);
    }

    static void order(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[evenIndex] = arr[i];
                evenIndex++;
                count++;
            } else {
                result[oddIndex] = arr[i];
                oddIndex--;
            }
        }
        
        Arrays.sort(result, 0, count);
        Arrays.sort(result, count, n);


        int start = count;
        int end = n - 1;
        while (start < end) {
            int temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(result));
    }
}


/*
 

for (int index = result.length -1; index >= count ; index--) {
    // System.out.println(result[index] +" ");
 }
 */