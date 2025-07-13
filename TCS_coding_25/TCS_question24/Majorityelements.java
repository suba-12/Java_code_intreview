package TCS_coding_25.TCS_question24;
/*
 Example

 Input:

6
2 4 2 4 2 4

Expected Output:

2 4
 */

import java.util.Scanner;
public class Majorityelements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < arr.length;i++){
         arr[i] = sc.nextInt();
        }
        sc.close();
       
     int t = size/3;
     int[] freq = new int[1000001];


        for(int i = 0; i < size ; i++){
        freq[arr[i]]++;
         }
       for(int i = 0 ; i < size ; i++){
                    if(freq[arr[i]] >= t){
                        System.out.print(arr[i]+" ");
                        freq[arr[i]]=0;
                    }
       }
     
        }
         }

