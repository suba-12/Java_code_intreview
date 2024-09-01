package assignment;

import java.util.Scanner;

public class Leet1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 234
        int multi = 1;
        int sum= 0;


        while(n >0){
            int rem = n%10; // last 4
            multi = multi* rem;
            sum =  sum + rem;
            n = n/10;
        }

        System.out.println(multi);
        System.out.println(sum);
        int res = multi - sum;
        System.out.println(res);


        
    }
}
