package TCS_coding_25.Strings;
//Capitalize first and last character of each word
//hello world
//HellO WorlD
import java.util.Scanner;
public class Captialize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            int n = str.length();
            if(index == 0 || str.charAt(index - 1) == ' '){
                 ch = Character.toUpperCase(ch);
            }
            if(index < n - 1 && str.charAt(index+1) == ' ' || index == n-1){
                ch = Character.toUpperCase(ch);
            }
            result +=ch;
        }
        System.out.print(result);
        sc.close();

    }
}
