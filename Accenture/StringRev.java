package Accenture;
import java.util.*;
public class StringRev {
    public static void main(String[] args){
    String str = "subashini" ;
    String ans = "";
    for(int i = str.length()-1  ;i >= 0 ;i--){
        ans = ans+str.charAt(i)+" ";
    }
    System.out.println(ans);
       // System.out.println(ans.substring(0,ans.length()));
    }
}
