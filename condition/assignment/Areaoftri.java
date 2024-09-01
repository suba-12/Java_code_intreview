package assignment;

import java.util.Scanner;

public class Areaoftri {
    public static void main(String[] args) {
        System.out.println("enter the value of base and height :");
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double height = in.nextDouble();
        double area = 0.5 * base* height;
        System.out.println(area);

    }
    
}
