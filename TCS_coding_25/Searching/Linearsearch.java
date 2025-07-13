package TCS_coding_25.Searching;
import java.util.Scanner;
//import java.util.*;


// linear search 
// input = {23,45,35,23,1,5}
// target = 23

public class Linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        
        System.out.print("enter the size of the array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("enter the array elements :");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        System.out.print("enter the target elemet:");
       int target = sc.nextInt();

        int result =linear(arr, target);
        if(result == -1){
            System.out.print("the elemet not found");

        }
        else{
            System.out.print("the element found " + result);
        }


    
       sc.close(); 
    }


    static int linear(int[] arr , int tar){
        
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]== tar){
              return index;
            }
            
        }

        return -1;
    }

}
