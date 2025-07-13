package TCS_coding_25.College_tcs;
//Minimum Difference-Zoho8
//4
//55 44 33 22
import java.util.Arrays;
import java.util.Scanner;
public class Difference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int size = Integer.parseInt(parts[parts.length -1]);
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(arr);

 int max = Integer.MAX_VALUE;
 int dif = 0;
        for (int index = 0; index < arr.length -1 ; index++) {
           dif = arr[index +1] - arr[index];
           if(dif < max){
            max = dif;
           }
        }
           for (int i = 0; i < arr.length -1; i++) {
            if (arr[i + 1] - arr[i] == dif) {
                System.out.print(arr[i] + " " + arr[i + 1] + " ");
            }
        }
                
            }
        }
    

