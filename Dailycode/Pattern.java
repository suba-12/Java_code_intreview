package Dailycode;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
         int k = 4;
         //pattern1(n);
         //pattern2(n, k);
         //pattern3(n);
        //pattern4(n);
        //pattern5(n);
        pattern6(n);
    }


/* 6
              *
             ***
            *****
           *******
 */

 static void pattern6(int n){
    for (int index = 0; index < n; index++) {
        for (int s = 0; s < n- index -1; s++) {
            System.out.print(" ");

        }
        for (int i = 0; i < 2*index +1; i++) {
           System.out.print("*");
        } 

        System.out.println(" ");
    
      }
    }


/* 5
           *
           **
           ***
           ****
 */

 static void pattern5(int n){
    for (int index = 0; index <= n; index++) {
        for (int i = 1; i <= index; i++) {
           System.out.print("*");
        } 
        System.out.println(" ");
    
      }
    }

    /*4
        ****
       ****
      ****
     ****

     */

 static void pattern4(int n){
    for (int index = 0; index < n; index++) {
        for (int s =index - n -1; s < n; s++) {
            System.out.print(" ");
        }
        
        for (int i = 0; i < n; i++) {

            System.out.print("*");
        }
    
        System.out.println(" ");
    
      }
    }

    /*3
    **** 
     ****
      ****
       ****
     */

    static void pattern3(int n) {
        for (int index = 0; index < n; index++) {
            for (int s = 1 - index; s < n; s++) {
                System.out.print(" ");
            }

            for (int i = 0; i < n; i++) {

                System.out.print("*");
            }

            System.out.println(" ");

        }
    }

    /*2

     ****
     *  *
     *  *
     ****
     */

    static void pattern2(int n, int k) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if ((i == 1 || i == n) || (j == 1 || j == k))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 1 .
    /* 
    ****
    ****
    ****
    ****
    */

    static void pattern1(int n) {
        for (int index = 0; index < n; index++) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}