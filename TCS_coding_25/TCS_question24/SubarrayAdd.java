package TCS_coding_25.TCS_question24;
/*
 4
1 2 3 4
3
[1 2 ]
[3 ]
 */

import java.util.Scanner;
public class SubarrayAdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();

        for(int i = 0 ; i < arr.length;i++){
            int sum= 0 ;
            for(int j = i ; j < arr.length;j++ ){
                 sum +=arr[j];
                 if(sum == target){
                    System.out.print("[");
                    for(int k = i ; k <= j ;k++){
                        System.out.print(+arr[k]+" ");
                    }
                    System.out.println( "]");
                 }
                 
            }

        }
        sc.close();

    }
}
