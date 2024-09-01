package WIPRO;

public class Digitsum {
    public static void main(String[] args) {
        int n = -1346;
    
        int ans = digitsum(n);
        System.out.println(ans);
    }

    static int digitsum(int n){
        int sum = 0;
        int originalN = n;
        while( n != 0){
            int rem = n%10;
            sum = sum + rem;
            n /= 10;

        }
        if(sum >= 9){
        sum =  digitsum(sum);
        }
        if (originalN < 0) {
            sum = -sum; // If original number was negative, make sum negative
        }
        return sum;
    }
    
}

/*
            
 */