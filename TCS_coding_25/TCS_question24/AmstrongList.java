package TCS_coding_25.TCS_question24;
/*
Input: 153, 371, 108
Output:153 371
 */

import java.util.Scanner;
public class AmstrongList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int n = input.length;
        int arr[]= new int[n];
        for (int index = 0; index < input.length; index++) {
            arr[index] = Integer.parseInt(input[index].trim());
        }

        for (int i = 0; i < n; i++) {
            if (isamg(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    static boolean isamg(int num){
        int temp = num;
        int digit = 0 ;
        while(num > 0){
            int rem = num % 10;
            digit += rem * rem*rem;
            num = num/10;
        }
        return temp == digit;
    }
}
