package Arraystest;
/*
 Input: array[]= {5, 10, 20, 15}
Output: 20
 */
public class Peekelement {
    public static void main(String[] args) {
        int[] arr ={10, 20, 15, 2, 23, 90, 67};
        System.out.println(peek(arr));

    }

    static int peek(int[] arr){
        int n = arr.length;
        // edge case
        if(arr[0] >= arr[1]) return 0;
        if(n == 1) return 0;
        if(arr[n-1] >= arr[n-2]) return n-1;

     for (int index = 1; index < arr.length; index++) {
        if(arr[index -1] <= arr[index] && arr[index +1] <= arr[index]){
            return arr[index];
        }
        
     }

        return 0;
    }

}
