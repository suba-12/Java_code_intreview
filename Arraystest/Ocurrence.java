package Arraystest;
/*
 Input: X = 2, Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
 */
public class Ocurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int k = 2;
       System.out.println(occur(arr, k));
    }
    static int occur(int[] arr , int k){
        int count =0;
        for (int val : arr) {
            if(val == k) {
              count++;           
        }
    }
    return count ;
  }
}
    
