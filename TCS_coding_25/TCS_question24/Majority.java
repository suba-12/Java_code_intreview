package TCS_coding_25.TCS_question24;
import java.util.Scanner;
/*
Input: nums = [3,2,3]
Output:3
- Given array: `[3,2,3]`
- Frequency: `{3: 2, 2: 1}`
- [n/3]= [3/3] = 1
- Element appearing more than 1 time: **3**
 */
public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        String[] input = sc.nextLine().split(" ");
        int n = input.length;
        int[] arr = new int[n];
        for (int index = 0; index < n; index++) {
            arr[index] = Integer.parseInt(input[index]);
        }
        sc.close();

        int t = n/3;
        int[] freq = new int[1000];
        for (int index = 0; index < input.length; index++) {
            freq[arr[index]]++;
        }
       
        for(int i = 0 ; i < n ; i++){
            if(freq[arr[i]] > t){
                System.out.println(arr[i]);
                freq[arr[i]]=0;
            }
        }

    }
}
