package TCS_coding_25.Strings;

//13. Check if two strings are anagram of each other
//listen
//silent
import java.util.Scanner;
public class Anagrams {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    sc.close();
    if(ana(str1,str2)){
        System.out.println("Anagram");
    }
    else{
        System.out.println("not an anagram");
    }

   } 
   public static boolean ana( String str1 , String str2){
    if(str1.length() != str2.length() ){
        return false;
    }
    int[] charcount = new int[26];
    for(int i = 0 ; i < str1.length();i++){
        charcount[str1.charAt(i) -'a']++;
    }
    for(int i =0 ; i < str2.length() ; i++){
        charcount[str2.charAt(i) - 'a']--;
    }

    for(int count : charcount){
        if(count != 0){
            return false;
        }
    }

    return true;
   }
}
