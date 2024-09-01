package Array.lecture;

import java.util.Arrays;
// output : [1, 78, 56, 34]
public class Swapindex {
    public static void main(String[] args) {
        int[] arr = {1,34,56,78,67,10};
        swap( arr , 1 , 3);
        System.out.println(Arrays.toString(arr));
    }
   
    static void swap(int[] arr , int index1 ,int index2){
         int temp = arr[index1];
         arr[index1] = arr[index2];
         arr[index2] = temp;
    }

}

