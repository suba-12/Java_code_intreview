package TCS_coding_25.TCS_question24;
/*
 n = 7
arr = [-3, -5, 1, 6, -7, 8, 11]
Output : 18
 */
import java.util.Scanner;
public class Diffrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int index = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;

            }

        }

        int min = Integer.MAX_VALUE;
      
        for(int i = 0 ; i < index ; i++){
            if(arr[i] < min){
                min= arr[i];
            }

        }

        System.out.println(max - ( min));
       
    }
}
