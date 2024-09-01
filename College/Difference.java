import java.util.Arrays;

public class Difference {

    /*
     * 4
     * 55 44 33 22
     * Sample Output 0
     * 22 33 33 44 44 55
     */

    public static void main(String[] args) {
        int[] arr = { 21, 40, 25, 22 };
        dif(arr);

    }

    static  void  dif(int[] arr) {
        int min = Integer.MAX_VALUE;
          Arrays.sort(arr);

        for (int index = 1; index < arr.length; index++) {

            if ( (arr[index] - arr[index - 1]) < min) {
                min = arr[index] - arr[index - 1];
            }
        }

            for (int i = 1; i < arr.length; i++) {
                if (min == arr[i] - arr[i - 1]) {
                    System.out.println(arr[i] + " " + arr[i- 1]);
                }

        }
    }


}

/*
  1. candy 23
There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy. Children with a higher rating get more candies than their neighbors. Return the minimum number of candies you need to have to distribute the candies to the children.

Input Format

size of an array elements of an array

Constraints

n == ratings.length 1 <= n <= 2 * 104 0 <= ratings[i] <= 2 * 104

Output Format

integer

Sample Input 0

3
1 0 2
Sample Output 0

5


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i =1; i<n; i++){
            if ((a[i] - a[i-1]) < min){
                min = a[i] - a[i-1];
            }
        }
        
        for(int i=1; i<n; i++){
            if(min == a[i] - a[i-1]){
                System.out.print(a[i-1]+" "+a[i]+" ");
            }
        }
    }
}

 */