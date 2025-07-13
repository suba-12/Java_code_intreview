package Subarrays;
import java.util.Scanner;

public class MaxiSubArray {
// Maximum Subarray sum (Kadane's algorithm )
  //input : -2,1,-3,4,-1,2,1,-5,4
  // output : 


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n ; i++){
     arr[i] = sc.nextInt();
    }
    System.out.print(maxi(arr));
  }
   
static int maxi(int[] arr){
 int current = arr[0];
 int max = arr[0];
 for(int i = 1 ; i < arr.length ; i++){
    current = Math.max(arr[i], current + arr[i]);
    max = Math.max(current , max);
 }



    return max;

}

}
