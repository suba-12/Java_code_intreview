package Subarrays;

import java.util.Scanner;

public class MaxiSubArrayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxinum(arr);
    }

    static void maxinum(int[] arr) {
        int current = arr[0];
        int max = arr[0];
        int start = 0;
        int end = 0;
        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > current + arr[i]) {
                current = arr[i];
                temp = i;
            } else {
                current = current + arr[i];

            }
            if (current > max) {
                max = current;
                start = temp;
                end = i;

            }
        }

        for(int i = start ; i <= end ;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
