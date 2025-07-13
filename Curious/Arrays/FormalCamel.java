package Curious.Arrays;
import java.util.*;
//"ThisIsAnAutomationEra"
public class FormalCamel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if(Character.isUpperCase(c)){
                 res.append(" ");
                 res.append(Character.toLowerCase(c));
            }
            else{
                res.append(c);
            }
        }
        System.out.println(res.toString().trim());

    }
}





