package TCS_coding_25.Strings;
import java.util.Scanner;
public class RemoveChart {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input =sc.nextLine();
    StringBuilder result = new StringBuilder();
    for (int index = 0; index < input.length(); index++) {
        char ch = input.charAt(index);
        if((ch >= 'a' && ch <='z') ||(ch >='A' && ch <='Z') ){
              result.append(ch);
        }
    }
    for (int index = 0; index < result.length(); index++) {
        System.out.print(result.charAt(index));
    }
sc.close();
  }  
}
