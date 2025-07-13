import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.print(stack(arr));
    }
    
    static boolean stack(int[] arr) {
        int n = arr.length;
        int dir = 0; 
        
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]) {
                if(dir == 0) {
                    dir = 1; 
                } else if(dir == -1) {
                    return false; 
                }
            } else if(arr[i] < arr[i-1]) {
                if(dir == 0) {
                    dir = -1;
                } else if(dir == 1) {
                    return false; 
                }
            }
        }
        
        return true;
    }
}
