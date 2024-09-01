package String; // Remove or change this if not needed
import java.util.*;
import java.lang.*;
import java.io.*;

public class Longestcom {
    public static void main(String args[]) {
        // Your code goes here
        String s[] = {"florasd", "flow", "flight"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] S) {
       if( S == null || S.length == 0) return "";
       for (int index = 0; index < S[0].length(); index++) {
        char c = S[0].charAt(index);
        for (int i = 1; i< S.length; i++) {
            if( index  == S[i].length() || S[i].charAt(index) != c ) {
                return S[0].substring( 0 , index);
            }
            
        }
        
       }
        return S[0];
    }
}
