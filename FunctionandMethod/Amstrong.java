package FunctionandMethod;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* int n = in.nextInt();
          boolean ans = isAmstrong(n);
          System.out.println(ans); */ 

        for (int index = 100; index < 1000; index++) {
            if(isAmstrong(index)){
                System.out.println(index);
            }
            
        }
    }

    

    static boolean isAmstrong(int n) {
        int sum = 0;
        int org = n;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;

        }
        return sum==org;
    }
    /*
     * if(sum == org){
     * return true;
     * }
     * return false;
     */

   

}

