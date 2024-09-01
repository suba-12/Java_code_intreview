package Dailycode;

import java.util.Arrays;
// make distrit value
public class Makedistric {
   public static void main(String[] args) {
    int[] arr = {1301,11,48};
make(arr);
   } 
   static int[] make(int[] arr){
    int n = arr.length;
    int[] res = new int[10];
    for (int index = 0; index < arr.length; index++) {
        
     while(arr[index] > 0 ){
     int rem = arr[index]%10;  //1
     res[rem]++;
     arr[index] /=10;   //13
    
        }          
    }
    

    for (int index = 0; index < 10; index++) {  
        if(res[index] > 0){
           System.out.print(index+" ");
        }
        
    }

    return res;
   }
}
