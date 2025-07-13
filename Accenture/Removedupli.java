package Accenture;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Removedupli {
   public static void main(String[] arg){
     int[] arr1 = {1,2,3,4,5,6};
    // Set<Integer> set = new LinkedHashSet<Integer>();
    int[] result = duplicate(arr1);
   System.out.println(Arrays.toString(result));
   } 
   static int[] duplicate(int[] arr1){
    Set<Integer> set = new LinkedHashSet<Integer>();

    for(int val : arr1){
       set.add(val);
    }
    int[] res = new int[set.size()];
    int i = 0;
    for(int val : set){
        res[i] = val;
        i++;
    }

    return res;
   }
}
