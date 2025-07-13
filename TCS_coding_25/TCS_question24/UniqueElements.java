package TCS_coding_25.TCS_question24;
/*
 Input:
array = [1,3,2,3,2,4]
Output :
10
 */
import java.util.Scanner;
public class UniqueElements {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     int max =0;
     for(int i = 0 ; i < arr.length ; i++){
        arr[i] = sc.nextInt();
        if(arr[i] >max){
            max = arr[i];
        }
     }
 int[] freq = new int[max+1];
     for (int index = 0; index < arr.length; index++) {
        freq[arr[index]]=1; // count occurences
     }
     int sum =0;
     for (int index = 0; index <= arr.length; index++) {
        if(freq[index] ==1){
          sum += index;
        }
     }
     System.out.println(sum);
   }
}
