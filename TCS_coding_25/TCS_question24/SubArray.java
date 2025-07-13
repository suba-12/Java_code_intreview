package TCS_coding_25.TCS_question24;
/*
Input:

4 0 1 2 3

(4 - is the size of the array)

Output:

0, 0 1, 0 1 2, 0 1 2 3, 1, 1 2, 1 2 3, 2, 2 3 , 3
 */

import java.util.Scanner;
public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int arr[] = new int[n];

     
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int index = 0; index < arr.length; index++) {
            for (int j = index; j < arr.length; j++) {
                for (int k= index ; k <= j; k++) {
                    System.out.print(arr[k]);
                    if(k < j){
                        System.out.print(" ");
                    }
                }
                if(!(index ==arr.length -1 && j == arr.length -1)){
                    System.out.print(", ");
                }
            }
        }
    }
}
