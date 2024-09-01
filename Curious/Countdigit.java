package Curious;

public class Countdigit {
    public static void main(String[] args) {
        int n = 12230;
        System.out.print(count(n));
    }
    static int count(int n ){
        int sum = 0;
        while(n != 0){
            int rem = n%10;  // 3
            sum++;
            n /=10;
            
        }
        return sum;
    }
}
