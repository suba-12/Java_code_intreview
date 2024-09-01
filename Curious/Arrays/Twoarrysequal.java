package Curious.Arrays;

public class Twoarrysequal {
    public static void main(String[] args) {
        int[] arr = {12,2,-3,34,35,67};
        int[] arr1 = {12,2,-3,34,35,67};


        equal(arr ,arr1);
    }
  
        static void equal(int[] arr, int[] arr1) {
            if (arr.length != arr1.length) {
                System.out.println("Arrays are not equal");
                return;
            }
    
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != arr1[index]) {
                    System.out.println("Arrays are not equal");
                    return;
                }
            }
    
            System.out.println("Arrays are equal");
        
    
    }
}
