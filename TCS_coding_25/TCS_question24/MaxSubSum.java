package TCS_coding_25.TCS_question24;
/*
 Example 1:**
Input: array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6
 */
import java.util.Scanner;
public class MaxSubSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.replaceAll("\\[|\\]", "");
        String[] parts = input.split(",\\s*");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i].trim());
        }
int max = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            int sum = 0 ;
            for (int j = index; j < arr.length; j++) {
                sum +=arr[j];
                max =Math.max(max,sum) ;
                }
            }
            System.out.print(max);
        }
    
       

    }
