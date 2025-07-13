package TCS_coding_25.Basic_question.NUmber;
/*
 Question: Prime Number in the given range
Input: A = 10, B = 30
Output: [11, 13, 17, 19, 23, 29]
 */
import java.util.*;
public class Pime {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean  flag = true ;
    if (a <= 0 || a == 1){
        System.out.print("Not a prime");
    }
    else{
    for(int i = 2 ; i <= a ; i++){
       if (a % i == 0 ){
       flag = true;
       }
       else{
        flag = false;
       }
    }
    if (flag == false){
        System.out.print("prime");
    }
    else{
        System.out.print("not Pirme");
    }
}
}
}
