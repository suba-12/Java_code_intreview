package StringandBuilder;

import java.util.Scanner;

public class mangotree {
     public static void main(String args[]){
   
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     
     int[][] arr=new int[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           if(i==0 ||j==n-1 ||j==0){
                 System.out.print("*"+" ");
           }
           else{
            System.out.print("o"+" ");
           }
        }
        System.out.println();
     }
    
     
    
  }
}
