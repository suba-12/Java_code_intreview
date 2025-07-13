package TCS_coding_25.Basic_question;
import java.util.Scanner;
//Check Palindrome Number
 //Input: 121
 //Output: Palindrome

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
    
      pal(a);
    }
    static void pal(int a){
        int temp = a;
        int sum = 0;
        while(a > 0){
        int rev = a%10;
        sum = sum * 10 + rev ;
        a = a/10;
        }

        if( temp == sum ){
            System.out.print("Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
