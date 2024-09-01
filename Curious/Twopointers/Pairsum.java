package Curious.Twopointers;
public class Pairsum {
    /*
Input: x = 16, arr[] = [1, 4, 45, 6, 10, 8]
Output: true
Explanation: arr[3] + arr[4] = 6 + 10 = 16
     */
    public static void main(String[] args) {
       int[] arr = {1, -2, -1, 0, 5};
       int x = 0;
       System.out.println(pair(arr, x));
    }   
   
    
    static boolean pair(int[] arr , int x){
       for (int index = 0; index < arr.length; index++) {
           for (int j = index+1; j < arr.length; j++) {
               if(arr[index] +arr[j] == x) return true;
           }
           
       }
       return false;
    }
   }