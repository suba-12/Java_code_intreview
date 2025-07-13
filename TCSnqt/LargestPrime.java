package TCSnqt;

public class LargestPrime {
        public static void main(String[] args) {
            int N = 15;
            int result = largestPrime(N);
            System.out.println("Largest prime less than or equal to " + N + ": " + result);
        }
    
        static int largestPrime(int N) {
            for (int i = N; i >= 2; i--) {
                if (isPrime(i)) {
                    return i;
                }
            }
            return -1; // In case no prime number is found (shouldn't happen for N >= 2)
        }
    
        static boolean isPrime(int num) {
            if (num < 2) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    }
    

