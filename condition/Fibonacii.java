import java.util.Scanner;


public class Fibonacii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
      /*  int a = 0;
        int b = 1;
        int count = 2;
*/ 


        if(num <=1){
            System.out.println(num); 
          }
          int  a = 0;
          int  b  =1;
          int count = 2;
         int temp ;
          while(num >= count ){
              temp =a+b;
              a = b;
              b = temp;
              count++;
          }
            System.out.println(b); 
         }
        
       /* while(count <=num){ //2 <= 5  // 3 <=5   4   5      loop over(6)

            int temp = b; // temp = 1    1       2     3
            b  = b+a;    // b = 1+0      2       3    5
            a = temp;   // a = 1         1       2     3
            count++;    //count = 3      4       5     6
        }
        System.out.println(b);
    } */
}
