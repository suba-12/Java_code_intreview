package WIPRO;

public class Prime {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(primenumber(n));
    }

   public static int primenumber(int n){
        int count = 0;
        for (int index = 1; index <= n ; index++) {
            if(n%index ==0){
                count++;
            }
                
        }
        if(count == 2) return 2;
            
        else return 1;
    }
}
