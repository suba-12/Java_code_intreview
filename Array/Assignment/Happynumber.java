package Array.Assignment;

public class Happynumber {

    public static void main(String[] args) {
        int n = 23;
        System.out.println(ishappy(n));

    }

        public static boolean ishappy(int n){
            while(n != 1 && n !=4){
                n = getsquare(n);

            }
            return n == 1;
        }
        
    public static int getsquare(int n ){
        int sum = 0;

        while(n!=0){
         int rem = n % 10;  // 9
         sum = sum+(rem*rem); //81
         n = n /10;
         
        }

    
    return sum;

     
         
    }
}
