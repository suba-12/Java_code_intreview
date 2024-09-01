package FunctionandMethod;

import java.util.Scanner;

public class Greting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String gr = mygreet(name);
        System.out.println(gr);

    }

    static String mygreet(String name){
      String message = "Hello !"+name;
        return message;
    }
}
