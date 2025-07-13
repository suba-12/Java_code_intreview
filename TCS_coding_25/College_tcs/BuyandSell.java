package TCS_coding_25.College_tcs;
//Best Time to Buy and Sell Stock 20
//7 1 5 3 6 4
//5
import java.util.Scanner;
public class BuyandSell {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[]  input = sc.nextLine().split(" ");
    int[] arr = new int[input.length];
    for (int index = 0; index < input.length; index++) {
        arr[index] = Integer.parseInt(input[index]);       
    }
    int min = Integer.MAX_VALUE;
    int max = 0;
    for (int index = 0; index < arr.length; index++) {
        if( arr[index] < min){
            min= arr[index];
        }
        else{
            int profit = arr[index] - min;
            if(profit > max){
                max = profit;
            }
        }
    }
    System.out.println(max);

   } 
}
