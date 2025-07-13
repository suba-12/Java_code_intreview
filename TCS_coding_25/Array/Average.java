package TCS_coding_25.Array;

// 12 18 20 30 25
// 21
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String[] input = sc.nextLine().split(" ");
     int sum = 0;int count = input.length;
     for(int i = 0 ; i < input.length ; i++){
        sum += Integer.parseInt(input[i]);
     }
     double avg = (double) sum /count;
     System.out.println(avg);
     
    }
}
