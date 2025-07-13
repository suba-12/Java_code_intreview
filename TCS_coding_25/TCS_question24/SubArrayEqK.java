package TCS_coding_25.TCS_question24;
/*
nums = 1 2 3 -3 1 1 1
k = 3
**Output:**
6
The subarrays that sum to `3` are:
1. `[1, 2]`
2. `[3]`
3. `[3, -3, 1, 1, 1]`
4. `[1, 2, 3, -3]`
5. `[1, 1, 1]`
6. `[1, 2, 3 , -3]`
 */
import java.util.Scanner;
public class SubArrayEqK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int arr[] = new int[input.length];
        for(int i =0 ; i < input.length;i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        int t = sc.nextInt();
        int count =0;
        for (int index = 0; index < arr.length; index++) {
            int sum = 0 ;
            for (int j = index; j < arr.length; j++) {
                sum=sum+arr[j];
                if(sum == t){
                  count++;
                }
            }
        }
        System.out.println(count);
    }
}
