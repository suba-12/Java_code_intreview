package StringandBuilder;

import java.util.Scanner;

public class diagonalmatrixornot {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     int col=sc.nextInt();
     int[][] arr=new int[row][col];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr[i][j]=sc.nextInt();
        }
     }
     boolean val=true;
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(i==j && arr[i][j]!=1){
              val=false; 
          }
          if(i!=j && arr[i][j]!=0){
            val=false;
          }
        }
     }
     if(!val){
        System.out.println("no");
     }
     else{
        System.out.println("yes");
     }
     int sum=0;
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
          if(i==j ){
              sum +=arr[i][j]; 
          } 
        }
     }
     System.out.println("Sum of diagonal elements:"+sum);
      sc.close();
    }
}
