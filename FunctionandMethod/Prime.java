package FunctionandMethod;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans =isPrime(n);
        System.out.println(ans);

    }

    static boolean isPrime(int n){
        //edge case n = 3
        if(n <= 1){ 
            return false;
        }
        int c = 2;
        while(c*c <= n){ // 2*2 = 4 ---> 4 <= 3
            if(n%c == 0){
                return false;
            }
           c++;
        }
      
        
        return c*c >n; // if(c*c >n){ return true}
    }
}
