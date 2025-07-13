package TCS_coding_25.TCS_question24;
/*
 Input:10 (w)
100 (D)
Output
$30.00
 */
import java.util.Scanner;
public class ShippingCostCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double base = 5.00;
        double cost = 2.00;
        double costper = 0.5;

        double costtot = a * cost;
        double dist = (b/a) * costper;
        double tot = base+costtot + base;
        System.out.printf("$%.2f",tot);



    }
}
