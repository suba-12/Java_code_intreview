package Curious.Twopointers;

import java.util.Arrays;

/*
Input: arr[] = {0, -1, 2, -3, 1}
Output: (0 -1 1), (2 -3 1)
 */
public class Triples {
    public static void main(String[] args) {
        int[] arr =  {0, -1, 2, -3, 1};
        int x = 0;
        triple(arr, x);
       //System.out.println(Arrays.toString(arr));
    }
    static void triple(int[] arr, int x) {
        boolean found = false;
        for (int index = 0; index < arr.length - 2; index++) {
            for (int j = index + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[index] + arr[j] + arr[k] == x) {
                        System.out.println(arr[index]+ " "+ arr[j]+" " +arr[k]);
                         found = true;

                       // return new int[]{arr[index], arr[j], arr[k]};
                    }
                }
            }
        }
        if(found == false){
            System.out.println("not valid");
        }
      //  return null;
    }
}
