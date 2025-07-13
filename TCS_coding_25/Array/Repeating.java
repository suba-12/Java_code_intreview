package TCS_coding_25.Array;

import java.util.Scanner;

//Find All Repeating Elements in an Array
//7
//3 1 3 4 2 2 5

public class Repeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        for (int index = 0; index < size; index++) {
            arr[index] = Integer.parseInt(input[index]);
            
        }
        repeat(arr);
        sc.close();
      
    }

    static void repeat(int[] arr ){
       
        for (int index = 0; index < arr.length; index++) {
            for (int j = index + 1; j < arr.length; j++) {
                if(arr[index] == arr[j]){
                    System.out.print(arr[index] + " ");
                }
            }
        }
    }
}
