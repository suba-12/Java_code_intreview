package Patterns;

/*
 static void  pattern8(int n){
    for(int row  = 1 ; row < n ;row++){
        for (int col= 0; col < n; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

 */
public class pattern6 {
    public static void main(String[] args) {
       //pattern5(5); 
      // patternno6(5);
     // patternn7(5);
    // patterno7(5);
    // pattern8(5);
    //pattern9(5);
    //pattern13(5);
     pattern14(5);
    }

  /* 
   *********
    *     *
     *   *
      * *
       * 
 */ 

 static void  pattern14(int n){
    for (int row = 0; row < n; row++) {
        // Print leading spaces
        for (int space = 0; space < row; space++) {
            System.out.print(" ");
        }

        // Print stars and spaces
        for (int col = 0; col < 2 * (n - row) - 1; col++) {
            if (col == 0 || col == 2 * (n - row) - 2 || row == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}















/* 15. *
      * *
     *   *
    *     *
   *       *
    *     *
     *   *
      * *
       *


/*
 13
         *
        * *
       *   *
      *     *
     *********
 */

 static void  pattern13(int n){
    for(int row  = 1 ; row <= n ;row++){

        for (int space = n - row; space > 0; space--) {
            System.out.print(" ");
        }

        for (int col= 1; col <= 2*row -1; col++) {

            if(col ==1 || col == 2*row-1 || row == n){
                System.out.print("*");

            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

/*
    *********
     *******
      *****
       ***
        *
 */

 static void  pattern9(int n){
    for (int row = n; row >= 1; row--) {
        // Print leading spaces
        for (int space = n - row; space > 0; space--) {
            System.out.print(" ");
        }
        // Print stars
        for (int col = 0; col < 2 * row - 1; col++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


/*
        *      4
       ***     3
      *****    2
     *******   1
    *********  0
 */
static void  pattern8(int n){
   
for (int row = 1; row <= n; row++) {
    // Print leading spaces
    for (int space = n - row; space > 0; space--) {
        System.out.print(" ");
    }
    // Print stars
    for (int col = 0; col < 2 * row - 1; col++) {
        System.out.print("*");
    }
    System.out.println();
}

}



/*
*
**
***
****
*****
****
***
**
* 
*/
    static void pattern5(int n){
  
        for (int row = 0; row < 2 * n; row++) {  
            int totalCol =  row > n ? 2*n - row : row;
           for (int col = 0; col < totalCol; col++) {
               System.out.print("* ");
           }
           System.out.println();
       }
       }
/*
         *
        **
       ***
      ****
     *****
 */
       static void patternno6(int n){
        for (int row = 1; row <= n; row++) {
            // Print spaces
            for (int s = n - row; s > 0; s--) {
                System.out.print(" ");
            }
            // Print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

/*
*
**
***
****
*****
 */
    static void patternn7(int n) {
        for (int row = 1; row <= n; row++) {
            // Print stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
     *****
      ****
       ***
        **
         *
     */
    static void patterno7(int n){
        for (int row = 0; row < n; row++) {
            // Print leading spaces
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            // Print stars
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

     
}



