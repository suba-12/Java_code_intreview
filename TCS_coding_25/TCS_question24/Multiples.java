package TCS_coding_25.TCS_question24;
import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        for(int i = 1 ; i <= 10 ; i++){
        sum = sum+i*n;

        }
        System.out.println(sum);
        sc.close();
    }

}
