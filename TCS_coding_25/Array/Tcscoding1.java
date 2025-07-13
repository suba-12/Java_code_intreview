package TCS_coding_25.Array;



/*
Q1. You are in-charge for a event where participants provide donation. Your objective is to find wether the total sum of donation is equally divided by all donation value
Sample input 
28
Output
True
Explain. :
1+2+4+7+14 = 28
All are divisors of 28 and sum is equal to n
 */
import java.util.Scanner;
public class Tcscoding1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    int temp = num;
    for(int i = 1 ; i< num ; i++){
         if(num%i==0){
          sum = sum+i;
         }
    }
    //System.out.print(sum);
    if(sum == temp){
        System.out.print("True");
    }
    else{
        System.out.print("False");
    }
}

}
