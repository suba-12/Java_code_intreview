package TCS_coding_25.Array;

//Rotate Array by K Elements – Block Swap Algorithm
/*Input:
6
1 2 3 4 5 6
2
*/
import java.util.Scanner;
public class Roate {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        for(int i = 0 ; i< arr.length ; i++){
          arr[i] = Integer.parseInt(input[i]);
        }
       
        int k = sc.nextInt();


        //single 
        //rotatesingle(arr);
        //printing(arr);

        //k th 
        rotatek(arr, k);
        printing(arr);

        sc.close();
        
    }
    static void rotatesingle(int[] arr){
        int last = arr[arr.length -1 ];
        for(int i = arr.length - 1 ; i > 0 ; i--){
            arr[i] = arr[i- 1];
        }
        arr[0]=last;

    }

    static void  rotatek(int[] arr , int k){
        for (int index = 0; index < k; index++) {
            rotatesingle(arr);
        }
    }
    static  void printing(int[] arr){

        for (int val: arr) {
            System.out.print(val +" ");
        }
        System.out.println();
    }
}
