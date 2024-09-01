//package College;
/*
 3
1 0 2

 */
public class Childeren {
    public static void main(String[] args) {
        int[] arr = {1,0,2};
        System.out.println(child(arr));
    }
    static int child(int[] arr) {
        int n = arr.length;
        int count = 0;

        if (n == 1) {
            return 0;
        }

        if (arr[0] > arr[1]) {
            count++;
        }

        if (arr[n - 1] > arr[n - 2]) {
            count++;
        }

        for (int index = 1; index < n - 1; index++) {
            if (arr[index] > arr[index - 1])  {
                count++;
            }
            if(arr[index] > arr[index + 1]){
                count++;
            }
        }

        return count + n;
    }

  

}


/*

2. min difference
Write a program that takes an integer M and M integer array elements as input. The program needs to find the minimum difference between two elements in the integer array. The program then needs to print all those pairs of elements that have the minimum difference. If more than one pair has the minimum difference, then the program should print the output in the ascending order, if an element exists in two or more pairs, then it should be printed two times or more.

Input Format

The first line contains an integer M denoting the size of the array. The second line contains M space-separated integers representing the elements of the array.

Constraints

1 ≤ M ≤ 10^5 Elements of the array are integers.

Output Format

The output should consist of space-separated integers representing the pairs of elements with the minimum difference, printed in ascending order. If multiple pairs have the minimum difference, print all such pairs. If an element exists in two or more pairs, it should be printed multiple times.

Sample Input 0

4
55 44 33 22
Sample Output 0

22 33 33 44 44 55

 */
/*
 public class Solution {

    public static void main(String[] args) {
        Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int candy[] = new int[n];
        
        Arrays.fill(candy, 1);
        
        for(int i=0; i<n; i++){            
            if(i==0){
                if(a[i]>a[i+1]){
                    candy[i]++;
                }
            }
            else if(i == n-1){
                if(a[i]>a[i-1]){
                    candy[i]++;
                }
            }
            else{
                if(a[i]>a[i-1]){
                    candy[i]++;
                }
                if(a[i]>a[i+1]){
                    candy[i]++;
                }
            }
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum += candy[i];
        }
        System.out.println(sum);
        
    }
}
 */
