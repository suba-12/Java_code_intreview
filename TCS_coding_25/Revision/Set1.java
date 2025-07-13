package TCS_coding_25.Revision;
// 3

//3
//7
import java.util.Scanner;
public class Set1 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int k = 10;
    int n = sc.nextInt();

    System.out.println("NUMBER OF CANDIES SOLD :"+" " + n);
    System.out.println("NUMBER OF CANDIES AVAILABLE:"+" "+(k-n));
    sc.close();
    }
}
