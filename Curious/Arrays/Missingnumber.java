package Curious.Arrays;

/*
 Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
Output: 5
Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5
 */
public class Missingnumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int num = 8;
       
       System.out.println(missing(arr , num )); 
    }
    static int missing(int[] arr ,int num){

        int n = arr.length;
        int[] hash = new int[n+1];

        for (int index = 0; index < arr.length-1; index++) {
            hash[arr[index]]++;
            
        }
        
        for (int index = 1; index <= num; index++) {
              if(hash[index] == 0){
                     return index;
              }      
        }
    return -1;
    }
}
