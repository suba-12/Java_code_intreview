package FunctionandMethod.Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i,fact = 1;
        for(i= 1;i<=num;i++){
            fact = (i*fact);
        }
        System.out.println(fact);
    }
}
