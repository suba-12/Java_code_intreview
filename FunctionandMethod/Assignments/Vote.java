package FunctionandMethod.Assignments;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
          System.out.println(isVote(n)); 

    }

    static boolean isVote(int n){
        return n >= 18 ;

        }
      

    
}
