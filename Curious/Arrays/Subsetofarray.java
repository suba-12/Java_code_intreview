package Curious.Arrays;

import java.util.Arrays;

/*
Input: arr1[] = {11, 3, 7, 1, 3, 7}, arr2[] = {11, 3, 7, 1} 
Output: Yes
 */
public class Subsetofarray {
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = { 0};
        int res =  subset(arr1,arr2);
        System.out.println(res == 1 ? "yes" : "No");
        
    }
    static int subset(int[] arr1 , int[] arr2){
      for (int value1: arr2) {
        boolean found = false;
        for (int value2 : arr1) {
            if(value1 == value2){
                found = true;
                break;
            }
            
        }
        if(!found) return -1;

        
      }
      return 1;
        

    }
}
