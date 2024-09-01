package TCSnqt;
import java.util.Arrays;
import java.util.Scanner;

// input 5
// 2,3,4,4,2
// output : 20 


public class Makedisadd {
   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt(); // Read the size of the array
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Read array elements
            }
            
            // Sort the array to easily handle duplicates
            Arrays.sort(arr); // 2,2,3,4,4,5
            
            int sum = arr[0];
            for (int i = 1; i < n; i++) {
                // Ensure each element is greater than the previous one
                if (arr[i] <= arr[i - 1]) 
                {
                    arr[i] = arr[i - 1] + 1;
                }
                sum += arr[i];
            }
            
            System.out.println(sum);
        }
    }
      

