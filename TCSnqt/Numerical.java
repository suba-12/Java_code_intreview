
package TCSnqt;

public class Numerical {
    public static void main(String[] args) {
        int s = 20;
        int e = 30;
        for (int index = s; index <=e; index++) {
            if(pali(index)){
              System.out.println(index);
            }
        }
         

    }
    static boolean pali(int num){
        int temp = num ; 
        int rev = 0;
      while( num > 0 ){
        int rem = num % 10 ;
        rev= rev*10 +rem ;
        num /=10;
      }

        return rev == temp;
    }
}
