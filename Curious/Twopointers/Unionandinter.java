package Curious.Twopointers;

import java.util.Arrays;

/*
 arr1[] = {7, 1, 5, 2, 3, 6} 
arr2[] = {3, 8, 6, 20, 7} 

 */
public class Unionandinter {
    public static void main(String[] args) {
       int[] arr1 = {7, 1, 5, 2, 3, 6} ;
       int[] arr2 = {3, 8, 6, 20, 7} ;
       //intersection(arr1, arr2);
        union(arr1, arr2);
      // System.out.println(Arrays.toString(arr1));
    }
    // intersection

    
    static void intersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0 ,j = 0;
        while( i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
              i++;
            }
            else{
                j++;

            }
        }
    }


// union 

static void union(int[] arr1, int[] arr2){
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int i=0 ,j = 0;
    System.out.print(arr1[i]);

    while( i < arr1.length && j < arr2.length){

      
        if(arr1[i] == arr2[j]){
            System.out.print(arr1[i]+" ");
            i++;
            
            j++;
        }
        else if(arr1[i] < arr2[j]){
          i++;
        }
        else{
            j++;
        }
    }
}






}
