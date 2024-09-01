package Dailycode;

import java.util.Arrays;
// First half accessending order and second half descending order
public class Fistassecdes {
    public static void main(String[] args) {
        int[] arr = {1,90,34,89,7,9,349,23};
        order(arr);
         /*
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int index = 0; index < n; index++) {
            arr[index] = sc.nextInt();
        }
       */  
        
    }
    static void order(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        for (int index =n /2 , j = n-1; index < arr.length-1 ; index++,j--) {

              int temp = arr[index];
              arr[index] = arr[j];
              arr[j] = temp;  
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*
  int start = n / 2;
        int end = n - 1;

        // Reverse the second half using a while loop
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
 */