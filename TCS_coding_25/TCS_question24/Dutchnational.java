package TCS_coding_25.TCS_question24;
/*
 Input :6
3 6 3 7 6 3 
Output :3 3 3 6 6 7 7
 */
import java.util.Scanner;
public class Dutchnational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length;i++){
         arr[i] = sc.nextInt();
        }
        sc.close();

        int count3 = 0 ;
        int count6 = 0;
        int count7 = 0;

        for(int num: arr){
            if(num ==3) count3++;
            if(num == 6)count6++;
            if(num == 7)count7++;

        }
        int index =0;
        while(count3 --> 0) arr[index++]=3;
        while(count6 --> 0)arr[index++]=6;
        while(count7 --> 0) arr[index++]=7;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
