package TCS_coding_25.Strings;
//Remove spaces from a string
import java.util.Scanner;
public class RemoveSpace {
    public static void main(String[] args){
        String str = "I love coding";
        char ch ;
        for (int index = 0; index < str.length(); index++) {
            ch = str.charAt(index);
            if(ch ==' '){
                continue;
            }
            System.out.print(ch);
        }
       
    }


}
