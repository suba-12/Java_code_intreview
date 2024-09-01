package Curious.Twopointers;

import java.util.Arrays;

/*
 Input : A[] = {1, 2, 3, 4, 5}
Output : 4
 The valid triplets are:
(1, 2, 3), (1, 3, 4), (1, 4, 5), (2, 3, 5)

Input : A[] = {1, 1, 1, 2, 2}
Output : 6


 */
public class Tripletscount {
    public static void main(String args[]) {
        // Your code goes here
        int[] A = {1, 1, 1, 2, 2};
        int N = 5;
        System.out.print(count_Triplets(A, N));
    }

        static int count_Triplets(int[] A, int N){
         int count = 0;
         Arrays.sort(A);
         for(int i = 0; i < N; i++){
           for(int j = i + 1; j < N; j++){
              for(int k = j + 1; k < N; k++){
                  if(A[i] + A[j] == A[k]){
                        count++;
                  }
              }
           }
         }
         return count; 
       }
     
       
    }

