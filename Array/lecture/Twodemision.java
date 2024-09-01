package Array.lecture;

import java.util.Arrays;
import java.util.Scanner;

/*
 enter the elements of the array :3
4
5
6
7
7
[3, 4][5, 6][7, 7]
 */
public class Twodemision {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int [][] arr = new int[3][2];
    System.out.print("enter the elements of the array :");
    for (int index = 0; index < arr.length; index++) {
        for (int col= 0; col < arr[index].length; col++) {
            arr[index][col] = in.nextInt();
        }
     }

     //enchance for loop
     for (int[] num : arr) {
        System.out.print(Arrays.toString(num));
        
     }
    }
    } 




/*
 System.out.println(arr.length);
//input
     for (int index = 0; index < arr.length; index++) {
        for (int col= 0; col < arr[index].length; col++) {
            arr[index][col] = in.nextInt();
        }
     }
     //output

     for (int index = 0; index < arr.length; index++) {
        for (int col= 0; col <arr[index].length; col++) {
           System.out.print(arr[index][col]+" ");

        }
        System.out.println();
     }
 */


 /* input
   for (int index = 0; index < arr.length; index++) {
        for (int col= 0; col < arr[index].length; col++) {
            arr[index][col] = in.nextInt();
        }
     }  
// output
     for (int index = 0; index < arr.length; index++) {
       System.out.println(Arrays.toString(arr[index]));   
     }
    }
    

    output:[12, 23]
           [34, 45]
           [56, 67]
  */