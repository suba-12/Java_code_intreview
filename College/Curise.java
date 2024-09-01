public class Curise {
    public static void main(String[] args) {
      int[] arr1 = {7 ,0 ,5, 1 ,3} ;
      int[] arr2 = {1, 2 ,1, 3, 4 };
      cruise(arr1, arr2); 
    }

    static void cruise(int[] arr1,int[] arr2){
        int guest = 0;
        int max = Integer.MIN_VALUE;
        for (int index = 0; index < arr1.length; index++) {
          //  for (int j = 0; j < arr2.length; j++) {
                guest += arr1[index] - arr2[index];
                if(guest > max ){
                    max = guest;
                }

        // }
            
        }
        System.out.println(max);
    }
}


/*

 A party has been organised on cruise. The party is organised for a limited time(T). 
 The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. 
 The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
  Example 1: Input : • 5 -> Value of T • [7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is separated by new line
• [1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
 Output : 8 -> Maximum number of guests on cruise at an instance.

Input Format

The first line of input will be a single integer, T, representing the number of hours the party lasts.
 The second set of inputs consists of T integers, each on a new line, representing the array E[i], 
 the number of guests entering the party at each hour. 
 The third set of inputs consists of T integers, each on a new line, representing the array L[i],
  the number of guests leaving the party at each hour.

Constraints

No Constraints

Output Format

The output should be a single integer representing the maximum number of guests present on the cruise at any instance during the T hours.

Sample Input 0

5
7 0 5 1 3
1 2 1 3 4 
Sample Output 0

8



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int buy = 0;
        int sell = 1, profit, max = 0;
        while(sell<n){
            if(a[sell] > a[buy]){
                profit = a[sell] - a[buy];
                if (profit > max){
                    max = profit;
                }
            }
            else{
                    buy = sell;
                }
            sell++;
        }
        System.out.println(max);
    }
}
 */