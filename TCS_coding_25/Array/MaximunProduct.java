package TCS_coding_25.Array;

import java.util.Scanner;

//5
//6 -3 -10 0 2
public class MaximunProduct {
  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        for (int index = 0; index < size; index++) {
            arr[index] = Integer.parseInt(input[index]);
            
        }
        product(arr);
        sc.close();
      
    }
static void product(int[] arr){
    int product = 1;
    int max = Integer.MIN_VALUE;;
    for (int index = 0; index < arr.length; index++) {
        for (int j= 0; j < arr.length; j++) {
            product = product*arr[j];
            if(product > max){
                max = product;
            }
        }
       
        }
      
   
    System.out.print(max);
}

}
