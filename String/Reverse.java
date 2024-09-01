
package String;

public class Reverse{
public static void main(String[] args){
    String str[]  = " way of storing".split(" ");
    String ans = " ";
    for (int index = str.length -1; index >= 0; index--) {
        ans = ans+str[index] +" ";
    }
    System.out.println(
        ans.substring(0, ans.length() - 1));
    }
}