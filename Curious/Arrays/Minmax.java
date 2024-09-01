package Curious.Arrays;

public class Minmax {
    public static void main(String[] args) {
        int[] arr = {12,2,3,34,35,67};
        minmax(arr);
    }
    static void minmax(int[] arr){
        int min  = arr[0];
        int max  = arr[0];

        for (int index = 0; index < arr.length; index++) {
            if(max < arr[index]){
                max = arr[index];
            }
        }
        System.out.println(max);

          for (int index = 0; index < arr.length; index++) {

             if(min > arr[index]){
                min = arr[index];
            }           
        }
        System.out.println(min);

    }
}
