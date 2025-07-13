package TCS_coding_25.Array;

import java.util.Scanner;


//7
//4 5 6 5 4 6 4
public class Countfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        for (int index = 0; index < size; index++) {
            arr[index] = Integer.parseInt(input[index]);
            
        }
        count(arr);
        sc.close();

        
    }
   
    static void count(int[] arr){
        boolean vis[] = new boolean[arr.length];
        for(int i = 0 ;  i < arr.length ;i++){
           // if(vis[i]) continue;  without this print the all values with occurences
            int count = 1;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count++;
                    vis[j] = true;
                }
            }
            System.out.println(arr[i] +"appers"+ count + "times ");
        }

    }


}
