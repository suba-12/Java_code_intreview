package Dailycode;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
       // reverse(arr);
        rev(arr);

    }
// method one
    static void reverse(int arr[]) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));

    }
// another method
    static void rev(int arr[]) {
        int n = arr.length;
        for (int index = n - 1; index >= 0; index--) {
            System.out.print(arr[index]+" ");

        }
    }
}
