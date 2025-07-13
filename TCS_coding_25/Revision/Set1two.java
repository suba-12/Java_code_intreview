package TCS_coding_25.Revision;

import java.util.Scanner;
public class Set1two {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = 3;
    int column = 3;
    int[][] arr = new int[row][column];
    int[] avg = new int[3];
    int max = 0;
    for(int i = 0 ; i < 3 ; i ++ ){
        for(int j = 0 ; j < 3; j++){
            arr[i][j] =sc.nextInt();
            if(arr[i][j] < 1 || arr[i][j] > 100){
                arr[i][j]=0;
            }
        }
    }
    
    for(int i = 0 ; i < 3 ; i ++ ){
        for(int j = 0 ; j < 3; j++){
            avg[i] = avg[i]+ arr[i][j];
            }
            avg[i]=avg[i]/3;
        }


        for(int i = 0 ; i < 3; i++){
            if(avg[i]>max){
                max = avg[i];
            }
        }

        for (int index = 0; index < 3; index++) {
            if(avg[index]== max){
                System.out.println("Trainee Number:" + index+1);
            }
            if(avg[index] <=70){
                System.out.println("Trainee is unfit");
            }
        }
    }
    }

