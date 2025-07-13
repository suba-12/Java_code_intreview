package TCS_coding_25.Strings;
import java.util.Scanner;
// Remove all vowels from the string
//Programming is fun
public class RemoveVowels {
    public static void main(String[] args){
        String word = "Programming is fun ";
        char ch ;
        for(int i =0 ; i < word.length() ; i++){
             ch = word.charAt(i);
             if(ch == 'a' || ch =='e'||ch =='i'|| ch =='o'|| ch =='u'){
                continue;
             }
             System.out.print(ch);
        }
        
        
       // sc.close();
        

    }
}
