package Dailycode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ascdes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b=1;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if((a[i] & b) ==0){
                a[i] *= -1;
            }
        }

        Arrays.sort(a);
        for(int i=0; i<n; i++){
            if((a[i] & b) ==0){
                a[i] *= -1;
            }
        }
        
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        
    }
}

