package Array.Assignment;
/*
 989. Add to Array-Form of Integer

Example 1:

Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
 */

public class Arrayaddint {
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;
      //  int n = arr.length;

       int ans = form(arr, k);
       System.out.println(ans);
       
    }
    static int form(int[] arr ,int k){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum *10 + arr[i];  
        }
       // int result = sum + k;
        return sum +k;
       
    }



}
