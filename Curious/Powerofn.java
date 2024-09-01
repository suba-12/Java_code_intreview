package Curious;

public class Powerofn {
    public static void main(String[] args) {
        int n =2;
        int x =5;
        System.out.println(power(x, n));
    }
    static long power(int x, int n){
        long pow = 1l;
        for (int index = 1; index <= x; index++) {
            pow *=n;
        }
        return pow;
    }
   
}
