package Accenture;

import java.util.Scanner;

/*
 Find Maximum In An Array
Q.4 Write a function FindMaxInArray, which will find the greatest number from an array with its desired index? 
The greatest number and its desired index should be printed in separate lines.

Sample Test Case:

Input:

10

15 78 96 17 20 65 14 36 18 20

Output:

96

2
 */
public class Maximumarray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("enter the size of the element");
    int[] arr = new int[n];
    System.out.print("Enter the elements ");
    for (int index = 0; index < arr.length; index++) {
        arr[index] = sc.nextInt(); 
    }
    maxi(arr);
  }  

  static void maxi(int[] arr){
    int a = arr[0];
    int b = 0;
    for (int index = 0; index < arr.length; index++) {
        if(a < arr[index]){
            b = index;
            a = arr[index];

        }
    }
    System.out.print("array of index :"+ a+" "+b);
  }
}
