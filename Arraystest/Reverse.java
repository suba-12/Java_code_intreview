package Arraystest;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {   
    int[] arr ={10, 20, 15, 2, 23, 90, 67};
    reverse(arr);
    System.out.println(Arrays.toString(arr));

}
static int[] reverse(int[] arr){
    // edge case
        int start = 0;
        int last = arr.length - 1;
        while(start < last){
            swap(arr, start, last);
            start++;
            last--;
       
    }

    return arr;
}


static void swap (int[] arr , int first , int second){
    int temp =  arr[first];
    arr[first] = arr[second];
    arr[second] = temp;  
}

}

