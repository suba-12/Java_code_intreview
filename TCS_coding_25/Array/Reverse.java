package TCS_coding_25.Array;
import java.util.Scanner;

//5
//3 6 8 9 2
public class Reverse {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String inp = sc.nextLine();
    rev(inp);
    sc.close();


    }
    static void rev(String inp){
        String val[] = inp.split(" ");
        
     for (int index = val.length -1; index >= 0; index--) {
        //int arr = Integer.parseInt();
        System.out.print(val[index] + " ");
     }
    }
}
