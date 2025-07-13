package TCS_coding_25.Strings;
import java.util.Scanner;

//swiss
//w

public class Notrepating {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String  word = sc.nextLine();
         
         sc.close();
         char[] charct =new char[word.length()];
         int[] count = new int[word.length()];
         int unique = 0;
   
         for(int i = 0 ; i < word.length(); i++){
              char ch = word.charAt(i);
              boolean found = false;
              for(int j = 0 ; j < unique ; j++){
                if(charct[j] == ch){
                    count[j]++;
                    found = true;
                    break;
                }
              }

              if(!found){
                charct[unique]=ch;
                count[unique]=1;
                unique++;

              }
         }
         boolean hasNonRepeating = false;
         for (int index = 0; index < unique; index++) {
            if(count[index] == 1){
                System.out.print(charct[index] + " ");
                hasNonRepeating = true;
            }
         }
         if(! hasNonRepeating)
         System.out.println("no");

    }
}
