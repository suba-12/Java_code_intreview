package TCS_coding_25.Array;


//6
//12 35 1 10 34 14
// 10
import java.util.Scanner;
public class SecondSmallest {
   
    
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];

    sc.nextLine();

    String input[] = sc.nextLine().split(" ");
    for(int i = 0 ; i < size ; i++){
      arr[i] = Integer.parseInt(input[i]);
    }

    int sec = secondsmall(arr);

    if (sec == Integer.MAX_VALUE) {
        System.out.println("No second smallest element exists.");
    } else {
        System.out.println("Second smallest number: " + sec);
    }

sc.close();
}
static int secondsmall(int[] arr){
    int fsmal = Integer.MAX_VALUE;
    int ssmal = Integer.MAX_VALUE;

    for(int i = 0 ; i < arr.length ; i++){
        if( arr[i] < fsmal){
            ssmal = fsmal;
            fsmal = arr[i];
        }
        else if(arr[i] < ssmal && arr[i] > fsmal){
         ssmal = arr[i];
        }
    }
    return ssmal;
}
}
