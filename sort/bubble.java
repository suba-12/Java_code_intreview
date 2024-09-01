package sort;

import java.util.Arrays;

public class bubble {
  public static void main(String[] args) {
    int[] arr = {1,3,4,5,6,2};
    buble(arr);
    System.out.println(Arrays.toString(arr));
  } 
  static void buble(int[] arr){

    // run n-1 times
    //boolean swapped;
    for (int index = 0; index <= arr.length; index++) {
       // swapped = false;
        for (int j=1; j < arr.length - index; j++) {
            if(arr[j] < arr[j -1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
               // swapped = true;
            }
            
        }
       // if(!swapped){
           // break;
       // }
        
    }
  }

  
}
