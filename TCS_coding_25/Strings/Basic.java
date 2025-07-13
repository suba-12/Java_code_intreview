package TCS_coding_25.Strings;
import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lastname = sc.nextLine();
        System.out.println("length" +" "+ name.length());
        System.out.println("Indexof"+" "+name.indexOf("u"));
        System.out.println("Upper case" +" "+ name.toUpperCase());
        System.out.println("Lower case"+" "+name.toLowerCase());
        System.out.println("concate"+ name +" "+lastname);
        System.out.println("concate function"+name.concat(lastname));
        String n1 = "1";
        String n2 = "2";
        System.out.println(n1 + n2);
        String spl = "this is \"world \" ";
        String spl1 = "this is \\world  ";
        System.out.println("Hello\nWorld!");

        // \r - Carriage Return (Moves cursor to the beginning of the line)
        System.out.println("Java\rCode");

        // \t - Tab Space
        System.out.println("Hello\tWorld!");

        // \b - Backspace (Removes the previous character)
        System.out.println("Backspac\bExample");

        // \f - Form Feed (May not be visible in console output)
        System.out.println("FormFeed\fExample");
    }
}