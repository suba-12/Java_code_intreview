package Patterns;
/*  *
    **
    ***
    ****
    *****
 */
public class Pattern1 {
    public static void main(String[] args) {
       pattern(5); 
       pattern2(5);
    }
    static void  pattern(int nums){
        for (int index = 1; index <= nums; index++) {
            for (int col = 1; col <= index; col++) {
                System.out.print( "* " );
            }
            System.out.println(" ");
        }
    }

    static void  pattern2(int nums){
        for (int index = 1; index <= nums; index++) {
            for (int col = 1; col <= index; col++) {
                System.out.print( col +" ");
            }
            System.out.println();
        }
    }




}
