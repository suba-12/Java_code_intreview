package TCS_coding_25.College_tcs;
//prime pairs
// 5
// 2 3
// 2 4
import java.util.Scanner;

public class Primepairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        // Step 1: Use Sieve of Eratosthenes to find prime numbers up to N
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Store primes in an array
        int[] primes = new int[N]; 
        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                primes[count++] = i;
            }
        }

        // Step 3: Find valid prime pairs
        boolean found = false;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                int sum = primes[i] + primes[j];
                if (sum <= N && isPrime[sum]) { 
                    System.out.println(primes[i] + " " + primes[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No prime pairs found.");
        }
    }
}
