package Accenture;
import java.util.*;

public class Union {  
    public static void main(String[]args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 6};
        
        Set<Integer> intersection = new HashSet<>();
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection.add(arr1[i]);  // Add to the set
                }
            }
        }
        
        System.out.println("Intersection of the two arrays: " + intersection);
    }
}
