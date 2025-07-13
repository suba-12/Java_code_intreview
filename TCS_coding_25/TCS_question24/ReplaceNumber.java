package TCS_coding_25.TCS_question24;
/*
 N = 4

[2, 3, 4, 5]

Output:

2 Three 4 Five

**Input:**

N = 2

[15, 3]
 */
import java.util.Scanner;
public class ReplaceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }

        for (int index = 0; index < arr.length; index++) {
           if(arr[index] %3 == 0 && arr[index]%5 ==0){
            System.out.print("ThreeFive"+" ");
           }
           else if(arr[index] %3 == 0){
            System.out.print("three"+" ");
           }
           else if(arr[index] % 5 ==0){
             System.out.print("Five"+" ");
           }
           else{
            System.out.print(arr[index]+" ");
           }
        }


       }
}
