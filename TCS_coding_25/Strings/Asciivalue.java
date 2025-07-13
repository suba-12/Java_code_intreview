package TCS_coding_25.Strings;

import java.util.Scanner;

public class Asciivalue {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);


        System.out.println((int)input);

     }
}
