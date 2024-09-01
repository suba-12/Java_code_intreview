package Dailycode;

// input : 5
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
 */
public class Diomandpatter {
    public static void main(String[] args) {
        int n = 5;
       pattern(n);
       patternlast(n);

    }
    static  void pattern(int n){
        for (int index = 1; index < n; index++) { // outer loop    // use equal 
            for (int space = 1; space <= n -index ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= index; j++) {
                System.out.print( "*"+" ");  // without the   +" " its output is  

            }
            System.out.println(" ");
        }
    }


    static  void patternlast(int n){
        for (int index = n; index >= 1; index--) { // outer loop
            for (int space = 1; space <= n -index; space++) {
                System.out.print(" ");
            }
            for (int j = index; j >= 1; j--) {
                System.out.print("*"+" ");  // without the   +" " its output is  

            }
            System.out.println(" ");
        }
    }




}



/* 
    * 
   ** 
  *** 
 **** 
*****   */
 

/*
    *  
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
 */