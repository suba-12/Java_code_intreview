package Curious.Arrays;
/*
 Input: arr[] = {2, -1, 5, 6, 0, -3} 
Output: 2 -1 5 6 0 -3
 */
public class Traverse {
    public static void main(String[] args) {
        int[] arr = {12,2,-3,34,35,67};
        traverse(arr);
    }
    static void traverse(int[] arr){
      
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
           
        }
        //System.out.println(max);

    }
}
