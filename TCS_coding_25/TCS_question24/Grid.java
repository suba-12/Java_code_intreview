package TCS_coding_25.TCS_question24;
import java.util.Scanner;
public class Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] grid= new int[m][n];
        for (int index = 0; index < m; index++) {
            for (int j = 0; j< n; j++) {
                grid[index][j] = sc.nextInt();
            }
        }

        if(grid[0][0] ==1 || grid[m-1][n-1] ==1){
            System.out.println("0");
            return;
        }
 int[][] dp = new int[m][n];
 dp[0][0] = 1;
        for (int index = 0; index < m; index++) {

            for (int j = 0; j< n; j++) {
                if(grid[index][j] == 1){
                    dp[index][j] = 0;
                }
                else{
                    if (index > 0) dp[index][j] += dp[index - 1][j]; // Paths from above
                    if (j > 0) dp[index][j] += dp[index][j - 1]; // Paths from left
                }
            }
        }
        System.out.println(dp[m-1][n-1]);
        
        sc.close();

    }
}
