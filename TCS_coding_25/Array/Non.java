package TCS_coding_25.Array;

import java.util.Scanner;

//Find All Repeating Elements in an Array
//6
//1 2 3 2 3 4


public class Non {
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
            int count = 0 ;
            for (int j = 0; j < arr.length; j++) {
                if(arr[index] == arr[j]){
                    count++;
                }
                
            }
            if(count  == 1){
            System.out.print(arr[index] + " ");
            }
        }
      
    }
}
