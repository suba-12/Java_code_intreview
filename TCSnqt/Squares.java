package TCSnqt;

public class Squares {
   public static void main(String[] args) {
    int n = 3;
    squares(n);
    cube(n);
   } 
   static void squares(int n){
    int sum = 0;
    for(int i = 1 ; i <= n ; i++){
       sum = sum +i*i;
    }
    System.out.println(sum);
   }

   static void cube(int n){
    int sum = 0;
    for(int i = 1 ; i <= n ; i++){
       sum = sum +i*i *i;
    }
    System.out.println(sum);
   }
}
