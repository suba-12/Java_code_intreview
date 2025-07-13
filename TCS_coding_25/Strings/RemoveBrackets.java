package TCS_coding_25.Strings;

import java.util.Scanner;

//Remove brackets from an algebraic expression
//(2+3) * (5-1)
public class RemoveBrackets {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter an algebraic expression:"+ " ");
        String expr = sc.nextLine();
        String result = "";
        for (int index = 0; index < expr.length(); index++) {
            char ch = expr.charAt(index);
            if(ch !='(' && ch != ')'){
                result += ch;
            }
        }
        System.out.print(result);
        sc.close();
  }  
}
