package assignment;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        System.out.print("enter the value :" +" ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans;
        for(int i =1;i <= n;i++){
              if( n % i == 0){
                System.out.print(" "+i);
              }


        }
    }
}
