package TCS_coding_25.TCS_question24;
import java.util.Scanner;
public class Maxsub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int index = 0; index < n; index++) {
           arr[index] = sc.nextInt();
        }
        int k = sc.nextInt();

        sc.close();

        for (int index = 0; index <= n-k; index++) {
            int max = arr[index];
            for(int j= index +1 ; j < index +k; j++){
               if(arr[j] > max){
                max = arr[j];
               }
            }
            System.out.print(max+" ");
        }
    }
}
