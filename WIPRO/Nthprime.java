package WIPRO;

import java.util.Scanner;

public class Nthprime {

    public static int nthPrime(int n) {
        int num = 1;
        int count = 0;
        int i;

        while (count < n) { //0 ,1,2 ,3,4 <5  
            num = num + 1;    // 2 ,3,4,5,6
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) { 
                count = count + 1; //`1,2
            }
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");
        int n = sc.nextInt();

        int nthPrimeNumber = nthPrime(n);
        System.out.println("The " + n + "th prime number is: " + nthPrimeNumber);
    }
}
