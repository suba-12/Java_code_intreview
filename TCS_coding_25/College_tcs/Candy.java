//Distributing Candies to Children
//3
//1 0 2
//5
package TCS_coding_25.College_tcs;
import java.util.Scanner;
public class Candy{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] = new int[size];

       
       for(int i = 0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
       }

       int[] candy = new int[size];
       for(int i = 0 ; i < arr.length ; i++){
        candy[i] = 1;
       }

       //left to right
       for(int i = 1; i < arr.length ; i++){
        if(arr[i] > arr[i -1]){
            candy[i] = candy[i-1]+1;

        }
       }

       //right to left
       for(int i = size - 2; i >= 0 ; i--){
        if(arr[i] > arr[i +1]){
            candy[i] = Math.max(candy[i],candy[i +1]+1);

        }
       }
       int sum  = 0;

       for (int index = 0; index < arr.length; index++) {
        sum = sum+candy[index];
       }
       System.out.println(sum);
       sc.close();
       
    }
}
