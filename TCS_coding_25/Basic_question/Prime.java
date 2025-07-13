package TCS_coding_25.Basic_question;

 //Input: 13
//Output: Prime

import java.util.Scanner;
public class Prime {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
   int a = sc.nextInt() ;
if(prime(a)){
    System.out.print("prime");
}
else{
    System.out.print("not prime");
}
}

static Boolean prime(int a){
    if( a <= 1) return false;

    for(int i = 2 ; i*i <= a;i++){

        if(a%i == 0) {
            return false;
        }
    }
         return true;
    
} 
}
