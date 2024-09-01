package Dailycode;

import java.util.Arrays;

public class REarrangearray {
    public static void main(String[] args) {
        int[] arr = {6,5,4,8,2,7}; // Input array

        // Separate arrays for odd and even numbers
        int[] oddNumbers = new int[arr.length];
        int[] evenNumbers = new int[arr.length];
        int oddCount = 0, evenCount = 0;

        // Extract odd and even numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers[evenCount++] = num;
            } else {
                oddNumbers[oddCount++] = num;
            }
        }
//System.out.println(Arrays.toString(evenNumbers));
        // Sort odd numbers in descending order
        Arrays.sort(oddNumbers, 0, oddCount);
        reverseArray(oddNumbers, 0, oddCount); // Reverse sorted odd array

        // Reverse even numbers
        reverseArray(evenNumbers, 0, evenCount);

        // Replace the original array with sorted odd and reversed even numbers
        oddCount = 0;
        evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evenNumbers[evenCount++];
            } else {
                arr[i] = oddNumbers[oddCount++];
            }
        }

        // Print the rearranged array
        System.out.println(Arrays.toString(arr));
    }

    // Helper method to reverse an array
    private static void reverseArray(int[] array, int start, int end) {
        for (int i = start; i < (end + start) / 2; i++) {
            int temp = array[i];
            array[i] = array[start + end - i - 1];
            array[start + end - i - 1] = temp;
        }
    }
}
