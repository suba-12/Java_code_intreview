package TCS_coding_25.Basic_question.NUmber;
import java.util.Scanner;

/*Question: Reverse a digit
Input: 1234
Output: 4321
 */
public class Reverse {
   public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int sum = 0;
   while( a>0){
   int digit = a%10;
   sum = sum *10 + digit;
   a /= 10;
   }
   System.out.print(sum);
   }
}
