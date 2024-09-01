import java.util.Arrays;

public class Leet1636 {
    /*
     Input: nums = [1,1,2,2,2,3]
     Output: [3,1,1,2,2,2]
     */
public static void main(String[] args) {
    int[] arr = {1,1,2,2,2,3};
    goals(arr);

}

static void goals(int[] arr){
    int n = arr.length;
    int[] arr1 = new int[n] ;
    for (int index = 0; index < arr.length; index++) {
           arr1[arr[index]]++;
        
    }
   // Arrays.sort(arr1);
   
    System.out.println( Arrays.toString(arr1));
    for (int index = 1; index < arr.length; index++) {

        
    }
}

}