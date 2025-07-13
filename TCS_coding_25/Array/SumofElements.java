package TCS_coding_25.Array;

//10 20 30 40
//100
import java.util.*;
public class SumofElements {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     
    String val[] = sc.nextLine().split(" ");
    add(val);
    sc.close();
    }
    static void add(String[] val){
        
        int sum = 0 ;

        for(String value : val){
            int arr = Integer.parseInt(value);
            sum = sum+arr;

        }
        System.out.print(sum);
    }
}
