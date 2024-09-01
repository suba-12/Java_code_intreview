package assignment;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        System.out.print("enetre the value :");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            int a = in.nextInt();
         if(a==0){
            break;
         }
        sum+=a;
        }

        System.out.println("The sum of all entered numbers is: " + sum);

    }
}
