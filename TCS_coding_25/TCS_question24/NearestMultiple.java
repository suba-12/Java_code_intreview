

package TCS_coding_25.TCS_question24;
/*
 X = 13

Y = 3

Output 1: 12

X = 13, Y = 3
13 / 3 = 4
4 * 3 = 12


 */
import java.util.Scanner;
public class NearestMultiple {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int nearest = (x/y) * y;
        System.out.println(nearest);

    
}
    
}
