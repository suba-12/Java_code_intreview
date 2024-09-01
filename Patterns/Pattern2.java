package Patterns;
/*
    *****
    *****
    *****
    *****
    *****
 */
public class Pattern2 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int nums){

        for (var index = 1; index <= nums; index++) {
            for (int col = 1; col <= nums; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
