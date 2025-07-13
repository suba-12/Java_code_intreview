package TCS_coding_25.Array;
import java.util.Scanner;

//7
//1 1 2 2 3 3 4

public class RemoveDup {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    sc.nextLine();
    String input[] = sc.nextLine().split(" ");
    for(int i = 0 ; i < arr.length ; i++){
        arr[i] = Integer.parseInt(input[i]);
    }
    int[] uni = duplicate(arr);
    for (int num :uni) {
        System.out.print(num);
    }
    sc.close();
}
static int[] duplicate(int[] arr){
    int temp[] = new int[arr.length];
    
   for(int i = 0 ; i < arr.length ; i++){
  boolean isduplicate = false;
    for(int j = 0 ; j < i ; i++){
            if(arr[i] == arr[j]){
                isduplicate = true;
                break;
            }
    }

if(!isduplicate){
    arr[i++] = arr[i];
}
   } 

   int[] result = new int[arr.length];
   for(int i =0 ; i < i ; i++){
    result[i] = arr[i];
   }
   return result;
}
}
