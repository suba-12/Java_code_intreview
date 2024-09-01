package Patterns;
/*
    *****
    ****
    ***
    **
    *

 */
public class Pattern3 {
   public static void main(String[] args) {
    pattern(5);
   } 
   static void pattern(int nums){
    for (int index = 1; index <= nums; index++) {
        for (int col = 1; col <= nums - index+1; col++) {
            System.out.print("*");
        }
        System.out.println();
    }

   }
}
