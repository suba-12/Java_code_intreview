
//prob1 --> find largest element in the 2d array 
//prob2 in same file --> largest element in each row 
package StringandBuilder;

import java.util.Scanner;

public class prob1 {
  public static void main(String args[]){
   
     Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     int col=sc.nextInt();
     int[][] arr=new int[row][col];
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
        arr[i][j]=sc.nextInt();
        }
     }
    
     
     for(int i=0;i<row;i++){
        int max=arr[i][0];
        for(int j=0;j<col;j++){
            if(arr[i][j]>max){
                max=arr[i][j];       
            }  
        }
        System.out.println("max element in"+i+"th row "+max);
     }
    // System.out.println("overall maximum element");
    // System.out.println(max);
     
     sc.close();
  }
}
