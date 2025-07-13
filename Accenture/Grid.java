package Accenture;
import java.util.*;
public class Grid {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            // Read the number of rows (N) and columns (M)
            int rows = sc.nextInt();
            int cols = sc.nextInt();
    
            // Initialize a variable to store the maximum sum of roses
            int maxRoses = Integer.MIN_VALUE;
    
            // Loop through each row
            for (int i = 0; i < rows; i++) {
                int currentRowSum = 0;  // Store the sum of the current row
    
                // Loop through each column and sum up the roses in the current row
                for (int j = 0; j < cols; j++) {
                    int roses = sc.nextInt();
                    currentRowSum += roses;
                }
    
                // Update maxRoses if the current row sum is greater than the previous maximum
                maxRoses = Math.max(maxRoses, currentRowSum);
            }
    
            // Output the maximum number of roses that can be collected from a single row
            System.out.println(maxRoses);
        }
    }
    
     
