package FunctionandMethod.Assignments;

import java.util.Scanner;

public class SmallestGreat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the 1 st number : " +" ");
        int a = in.nextInt();
        System.out.print("enter the 2 nd  number : " +" ");
        int b = in.nextInt();
        System.out.print("enter the 3 rd number : " +" ");
        int c = in.nextInt();
        System.out.println( " The Smallest number :" +" "+iSmallest(a, b, c));
        System.out.println(" The Largest number :" +" "+Largest(a, b, c));

    }
    static int Largest(int a ,int b ,int c){
      int ans = Math.max(c,Math.max(a,b));
      return ans;    
    }
    static int iSmallest (int a ,int b ,int c){
        int ans = Math.min(c,Math.min(a,b));
        return ans;    
      }

}
