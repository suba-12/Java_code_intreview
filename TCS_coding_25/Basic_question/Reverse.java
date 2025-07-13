package TCS_coding_25.Basic_question;


import java.util.Scanner;

import FunctionandMethod.Swap;

public class Reverse {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   // int n = sc.nextInt();
   //char ch = sc.next().charAt(0);
   double va = sc.nextDouble();

   //int a = 1234;
   //sum(a);
   //fibo(n);
  // digit(n);
  //charasciii(ch);
  //celfah(va);
  celfah(va);

  /*  // for GCD and LCM two inputs 
   int a = sc.nextInt();
   int b =sc.nextInt();
   int res =lcm(a, b);
   System.out.println("GCD: " + res);
   swap(a, b);*/
   sc.close();

 }

//Reverse a String
//Input: hello
//Output: olleh





//Convert Fahrenheit to Celsius
//Input: 98.6
//Output: 37
static void fahcel(double a){
    double cel = ( a - 32 ) * 5/9;
}

 //Convert Celsius to Fahrenheit
 //Input: 0
 //Output: 32
static void celfah(double a ){
double fah = a * (9/5)+32; 
System.out.println(fah);
}

 //Print ASCII Value of a Character
 //Input: A
 //Output: 65

static void charasciii(char a){
    System.out.print((int)a);
}

 //Count Digits in an Integer
// Input: 98765
 //Output: 5
 static void digit(int a){
    int count = 0;
    while(a > 0){
    int rev = a%10;
    a = a/10;
    count++;
 }
 System.out.print(count);
 }
//Swap Two Numbers Without Third Variable
//Input: a = 3, b = 5
//Output: a = 5, b = 3
static void swap(int a , int b){
 a = a+b;
 b = a-b;
 a = a-b;   
 System.out.println(a+" "+b);
}

 //Find LCM of Two Numbers
 //Input: 4 5
 //Output: 20
static int lcm(int a , int b){
    return (a*b)/gcd(a, b);
}

 //Find GCD of Two Numbers
 //Input: 12 18
// Output: 6
static int gcd(int a , int b){
 while(b != 0){
    int temp = b;
    b = a%b;
    a = temp;
 }
 return a;
}

//Print Fibonacci Series up to N
//Input: 5
//Output: 0 1 1 2 3

static void fibo(int n){
 int a = 0;
 int b = 1;
 System.out.print(a+ " " +b);
 for (int index = 2; index < n; index++) {
    int c = a+b;
    System.out.print(" "+c);
    a = b ;
    b = c;
 }
 System.out.println(); 


}

// Sum of digits
//Input: 123
//Output: 6
static void sum(int a){
    int sum = 0;
while(a > 0 ){
    int rem = a%10;
    sum = sum+rem;
    a = a/10;
}
System.out.print(sum);
}

// Reverse
//Input: 1234
//Output: 4321
    static void reverse(int a ){
        int rev = 0;
        int sum = 0;
        while(a > 0){
        rev = a%10;
        sum = sum *10 +rev;  
        a = a/10; 
        }
        System.out.print(sum);
       
    }
}
