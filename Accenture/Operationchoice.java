package Accenture;

import java.util.Scanner;

/*
Operation Choices
Q.5 Write a function OperationChoices(c, a, b) which will accept three integers as an argument, and the function will return:

(a + b) if the value of c=1.
(a – b) if the value of c=2.
(a * b) if the value of c=3.
(a / b) if the value of c=4.
Sample Test Case:

Input:

2
15
20

Output:
-5
 */
public class Operationchoice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();

    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(operation(a, b, c));

  }  

  static int operation(int a,int b, int c){
    int sum = 0;
    if(c == 1) return a+b;
    if(c == 2) return a-b;
    if(c == 3) return a*b;
    if(c == 4) return a/b;


   return 1; 
  }
}
