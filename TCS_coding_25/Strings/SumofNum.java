package TCS_coding_25.Strings;
//Sum of the numbers in a string
//a5b10c2
//17
import java.util.Scanner;

public class SumofNum {
    public static void main(String[] args) {   
    
    Scanner sc = new Scanner(System.in);
       String expr = sc.nextLine().toLowerCase();
       int sum = 0;
       int num = 0;
        for (int index = 0; index < expr.length(); index++) {
            char ch = expr.charAt(index);
            if(ch >= '0' && ch <= '9'){
                num = num * 10 +(ch -'0');
            }
            else{
                sum = sum +num;
                num = 0;
            }
            
        }
        sum = sum+num;
        System.out.print(sum);
    }

}