package sort;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,2};
        slection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void slection(int[] arr){
        for(int i = 0;i < arr.length ;i++){
            int last = arr.length - i-1;
            int maxindex = getmaxindex( arr,0,last);
            swap(arr, maxindex,last);

        }
    }

static void swap(int[] arr,int  first,int second){
   int temp = arr[first] ;
   arr[first]=arr[second];
   arr[second] = temp;
}

    static int getmaxindex(int[] arr,int start,int last){
        int max = arr[0];
        for(int i = 0;i < arr.length ; i++){ 
        if(max < arr[i]){
         max = i;
        }

        }

     return max;
    }

}
