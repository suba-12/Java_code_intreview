package TCS_coding_25.TCS_question24;
import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int index = n; index <= m; index++) {
            sum += index*index*index;
        }
        System.out.println(sum);
        sc.close();

    }
}
