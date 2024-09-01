package Array.lecture;

import java.util.Scanner;

public class Arraysin {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.print("enter the 5 elements :" +" ");
    for (int index = 0; index < arr.length; index++) {
        arr[index]= in.nextInt();
    }
    for (int num  : arr) {  // here num represents the element of the array
        System.out.print(num +" ");
    }
    }
   
}

/*
 for (int index = 0; index < arr.length; index++) {
       arr[index]= in.nextInt();
   }
   for (int index = 0; index < arr.length; index++) {

   System.out.print(arr[index] +" ");
   }
 */