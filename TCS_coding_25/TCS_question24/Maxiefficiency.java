package TCS_coding_25.TCS_question24;
/*
 **Input:**
5
3 -2 -8 4 1

**Output: 64**

- **Example Explanation:**
    - Given array: `[3, -2, -8, 4, 1]`
    - Maximum product of any 3 numbers: `(-8 * -2 * 4) = 64`
    - Output: **64**
 */

import java.util.Scanner;
public class Maxiefficiency {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int k = sc.nextInt();
for (int index = 0; index < arr.length; index++) {
    arr[index]=sc.nextInt();
}
int product =1;

    int max =Integer.MIN_VALUE;
    for(int i =0 ; i < n-2;i++){
     for(int j = i+1;j < n-1 ;j++){
        for(int s = j+1 ; s< n ;s++ )
         product = arr[i] * arr[j] * arr[s];

        if(product > max){
            max = product;

        }
     }
    }
    System.out.println(product);
   } 
}
