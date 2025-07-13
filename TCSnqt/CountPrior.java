package TCSnqt;
import java.util.Scanner;

//Input: Arr[] = { 3, 9, 4, 6, 7, 5 } 
//Output: 3

public class CountPrior {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
       // int[] arr = new int[n];
       // for(int i = 0 ; i < n; i++){
          //  arr[i] = sc.nextInt();
        //}

        
        int[] arr = {3, 9, 4, 6, 7, 5};
        int n = arr.length;
    // System.out.print(count(arr,n));
    System.out.print(countopt(arr,n));
    }

// brute force
   /* static int count(int[] arr , int n ){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ;j++){
                if(arr[i] > arr[j] ){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}*/ 

// time complexcity o(n^2)


// optimal 
static int countopt(int[] arr , int n){
    int max = 0;
    int count=0;
    for(int i = n-1; i >= 0 ; i--)  {
        if(arr[i] > max){
            count++;
        }

     max = Math.max(max,arr[i]);

    }
    return count;
}
}