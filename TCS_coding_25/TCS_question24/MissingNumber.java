package TCS_coding_25.TCS_question24;
/*
 ### **Example:**

### **Input  :**

4

1 2 3 5

Output : 4
 */
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for(int i =0 ; i< arr.length ; i++){
              arr[i] = sc.nextInt();
        }

        int n = s+1;
        int sum = n *(n+1)/2;
        int a = 0;
        for (int index = 0; index < s ; index++) {
            a +=arr[index];
        }
        System.out.println(sum -a);


    }
}
