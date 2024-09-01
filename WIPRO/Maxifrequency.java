package WIPRO;

public class Maxifrequency {
    


    public static int mostFrequentLargestDigit(int[] numbers) {
        int[] digitFrequency = new int[10];  // Array to store frequency of each digit (0-9)

        // Count the occurrences of each digit
        for (int number : numbers) {
            while (number > 0) {
                int digit = number % 10;
                digitFrequency[digit]++;
                number /= 10;
            }
        }

        // Print the frequency of each digit
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + digitFrequency[i] + " time(s)");
            }
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i < digitFrequency.length; i++) {
            if (digitFrequency[i] > maxFrequency) {
                maxFrequency = digitFrequency[i];
            }
        }

        // Find the largest digit with the maximum frequency
        int largestMostFrequentDigit = -1;
        for (int i = 9; i >= 0; i--) {  // Start from the largest digit
            if (digitFrequency[i] == maxFrequency) {
                largestMostFrequentDigit = i;
                break;
            }
        }

        return largestMostFrequentDigit;
    }

    public static void main(String[] args) {
        int[] numbers = {123, 234, 345, 456};
        int result = mostFrequentLargestDigit(numbers);
        System.out.println("The largest most frequent digit is: " + result);
    }
}

