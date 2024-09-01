
//max element in each column
package StringandBuilder;

import java.util.Scanner;

public class prob3 {
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
       
        for(int j=0;j<col;j++){
            int max=arr[0][j];
            if(arr[i][j]>max){
                max=arr[i][j]; 
                System.out.println("max element in"+j+"th column "+max);       
            }   
        }  
     }
    System.out.println("sum of elements");
    int sum=0;
    // System.out.println(max);
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
                sum+=arr[i][j];        
        }
       
     }
     System.out.println("sum of elements in the array"+sum);
     sc.close();
  }
}
