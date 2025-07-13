package TCS_coding_25.Array;


//int[] arr = {10, 22, 5, 14, 99, 32};
//99
import java.util.Scanner;
public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the entire line as a string
        String input = sc.nextLine();
        
        // Split the string into an array of strings
        String[] numbers = input.split(" ");
        
        // Convert string array to integer array
        int max = Integer.MIN_VALUE;
        for (String num : numbers) {
            int value = Integer.parseInt(num);
            if (value > max) {
                max = value;
            }
        }

        // Print the largest number
        System.out.println("Largest number: " + max);

        sc.close();
    }
}


