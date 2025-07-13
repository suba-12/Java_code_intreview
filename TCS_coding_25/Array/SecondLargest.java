package TCS_coding_25.Array;

import java.util.Scanner;
//Second Smallest and Second Largest Element in an Array
/*
6
12 35 1 10 34 1

output : 
6
12 35 1 10 34 1
34
 */
public class SecondLargest {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];

       for (int index = 0; index < arr.length; index++) {
        arr[index] = sc.nextInt();
       }
       /*sc.nextLine();
       String input[] = sc.nextLine().split(" ");
       for(int i = 0 ; i < size ; i++){
        arr[i] = Integer.parseInt(input[i]);
       }
         */
       System.out.print(second(arr));
       sc.close();
    }
    static int second(int[] arr){
        int flarg = Integer.MIN_VALUE;
        int slarg = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if( arr[i] > flarg){
                slarg = flarg;
                flarg =arr[i];
            }
            else if(i > slarg && i < flarg){
                slarg = arr[i];
            }
        }
return slarg;
    }
}
