package TCSnqt;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r =  3;//sc.nextInt();
        int c = 3 ;//sc.nextInt();

       // int[][] arr = new int[r][c];
       /*  for (int i= 0; i< r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }*/
            int[][] arr = {{1,2,3},
                            {4,5,6},
                        {7,8,9}};
            rotate(arr, r, c);

        
    }

    static void rotate(int[][] arr , int r , int c){
        for (int i= 0; i < r; i++) {
            for (int j= i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

  // reverse
  for (int index = 0; index < r; index++) {
    int left = 0 , right = c-1;
    while(left < right){
        int temp = arr[index][left];
        arr[index][left] = arr[index][right];
        arr[index][right]=temp;
       
        left ++;
        right --;
    }
    
  }

  for (int i= 0; i< r; i++) {
    for (int j = 0; j < c; j++) {
        System.out.print(arr[i][j] +" ");
    }
    System.out.println();
    }
}
}
