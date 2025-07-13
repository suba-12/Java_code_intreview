package TCS_coding_25.TCS_question24;
/*
 **Input:**

8

7L 7R 7L 8L 6R 7R 8R 6R

Output : 3

**Example 1:** Pairs: (7L, 7R), (6R, 6R), (8L, 8R) → Total = **3**
 */
import java.util.Scanner;
public class ShoePair {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] l = new int[101];
       int[] r = new int[101];
       for(int i = 0 ; i < n ; i++){
        String shoe = sc.next();
        int size = Integer.parseInt(shoe.substring(0,shoe.length()-1));
        char side = shoe.charAt(shoe.length()-1);
        if(side == 'L'){
            l[size]++;
        }else if(side =='R'){
             r[size]++;
        }
       }
       sc.close();

       int total = 0;
      /*  for(int i = 0 ; i <=100;i++){
        total += Math.min(r[i],l[i]);
       }
       System.out.println(total); */
       for (int i = 1; i <= 100; i++) {
        if (l[i] < r[i]) {
            total += l[i]; // Add the number of left shoes if fewer
        } else {
            total += r[i]; // Add the number of right shoes if fewer
        }
    }

    }
}
