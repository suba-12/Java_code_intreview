package TCS_coding_25.Array;

import java.util.Scanner;
import java.util.Arrays;

public class Median {
  
// 12 18 20 30 25
// 21
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String input = sc.nextLine();
        String[] values = input.split(" ");

        int n = values.length;
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(values[i]);
        }

        
        Arrays.sort(arr);

        double median;
        if (n % 2 == 1) {
            median = arr[n / 2];
        } else {
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }

        System.out.println(median);

        sc.close();
    }
}



