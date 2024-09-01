public class Maxijump {
   public static void main(String[] args) {
    int[] arr = {2,3,1,1,4};
    maxi(arr);
   } 
   static void maxi(int[] arr){
    int max = arr[0];
    int n = arr.length;
    for (int index = 1; index <= arr.length; index++) {
        if(arr[index] == n - 1){
             System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
   }
}


/*
You are given an integer array nums. You are initially positioned at the array's first index,
 and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Input Format

The first line contains an integer n, the length of the integer array nums. 
The second line contains n space-separated integers, representing the elements of the array nums.

Constraints

1 <= nums.length <= 104 0 <= nums[i] <= 105

Output Format

A single line containing either "true" if it's possible to reach or "false" otherwise.

Sample Input 0

5
2 3 1 1 4
Sample Output 0

true
Sample Input 1

5
3 2 1 0 4
Sample Output 1

false


import java.io.*;
import java.util.*;

public class Solution {

    public static boolean canHopToEnd(int[] array, int length){
        int lastPosition = length - 1;
        for(int i = length - 2; i >= 0; i--){
            if(i + array[i] >= lastPosition){
                lastPosition = i;
            }
        }
        return lastPosition == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close(); 
        boolean result = canHopToEnd(array, n);
        System.out.println(result);
    }
}
 */