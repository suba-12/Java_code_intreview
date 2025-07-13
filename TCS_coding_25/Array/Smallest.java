package TCS_coding_25.Array;
import java.util.*;

// output
//Enter the size: 4
//Enter the elements: 12 23 4 124
//Smallest number: 4

public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        sc.nextLine();  // Consume the leftover newline

        String[] input = sc.nextLine().split(" "); // Read full line and split by space
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]); // Convert to integer array
        }

        System.out.println("Smallest number: " + findSmallest(arr));
        sc.close();
    }

    static int findSmallest(int[] arr) {
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
