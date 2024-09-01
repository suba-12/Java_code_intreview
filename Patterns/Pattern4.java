package Patterns;
/*

*
**
***
****
*****
******
*****
****
***
**
*

 */
public class Pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int nums){

        for (var index = 0; index <= 2*nums ; index++) {
               int totalcol = index > nums ? 2*nums - index : index ;
            for (int col = 0; col <= totalcol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

