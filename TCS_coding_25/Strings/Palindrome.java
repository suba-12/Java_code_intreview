package TCS_coding_25.Strings;
import java.util.Scanner;
//Check if a given string is palindrome or not
//madam
//Yes, it is a palindrome.
public class Palindrome {
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String pal = sc.nextLine();
         int n = pal.length();
         boolean ispal = true;

          for(int i = 0 ; i < n/2 ; i++){
            if(pal.charAt(i) !=(pal.charAt(n-i-1))){
              ispal = false;
              break;
            }
          }
          if(ispal){
          System.out.println("Yes, it is a palindrome.");
        }else{
            System.out.println("not, it is a palindrome.");
        }
        sc.close();

    }
}
