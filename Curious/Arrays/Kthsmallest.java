package Curious.Arrays;
// output : -3
public class Kthsmallest {
    public static void main(String[] args) {
        int[] arr = {12,2,-3,34,35,67};
        System.out.println(kthsmalest(arr) );
    }
    static int kthsmalest(int[] arr){
      int min = arr[0];


        for (int index = 0; index < arr.length; index++) {
            if(min > arr[index]){
                min = arr[index];
            }          
        }
        return min;

    }
}
