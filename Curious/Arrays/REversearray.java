
package Curious.Arrays;

import java.util.Arrays;

public class REversearray {

   
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            reverse(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void reverse(int[] arr){
          int n = arr.length;
            for (int index = 0; index < n/2; index++) {
                int temp = arr[index];
                arr[index]= arr[n - index-1];
                arr[n - index -1] = temp;              
            }
        
         //   System.out.println(max);
    
        
    }
}
