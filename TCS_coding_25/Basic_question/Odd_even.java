package TCS_coding_25.Basic_question;
//import java.util.*;

import java.util.Scanner;
public class Odd_even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       // od(a);
       //factorial(a);
       //prime(a);
       
    }




//Input: 5   Factorial 
//Output: 120
 static void factorial(int n){
    int fact = 1;
    for(int i =1 ; i <= n;i++){
        fact = fact*i;
    }
    System.out.println(fact);
 }


//Input: 7 Odd or Even
//Output: Odd
    static void od(int a){
        
        if( a %2 ==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
    
}
