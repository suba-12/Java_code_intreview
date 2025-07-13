package TCS_coding_25.Basic_question;

//Input: 12 18
//Output: 18

import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the first number :");
        int b = sc.nextInt();
        if(a > b){
            System.out.print(a);
        }
        else{
            System.out.println(b);
        }

    }
}
