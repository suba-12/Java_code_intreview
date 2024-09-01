

package assignment;


import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int largest = Integer.MIN_VALUE;
        int number;
        
        System.out.println("Enter numbers to find the largest (enter 0 to stop):");
        
        while (true) {
            number = in.nextInt();
            
            if (number == 0) {
                break;
            }
            
            if (number > largest) {
                largest = number;
            }
        }
        
        if (largest != Integer.MIN_VALUE) {
            System.out.println("The largest number entered is: " + largest);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
