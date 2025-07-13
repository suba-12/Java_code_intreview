package TCS_coding_25.Revision;
//TCS NQT Coding Question 2023 – September Day 1 – Slot 1
import java.util.Scanner;
//200  -> Value of V
//540   -> Value of W


//TW =130 FW=70
public class Set0301 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
        float res = ((4*v)-w)/2;
        System.out.print("TW : "+" "+(int) res + " ");
        if(w >= 2 && w%2==0 && v<w){
            System.out.println("FW :"+" "+(int)( v-res));
        }
    }
}
