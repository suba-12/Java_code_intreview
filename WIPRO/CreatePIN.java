package WIPRO;

public class CreatePIN {
    public static void main(String[] args) {
        int a = 123;
        int b = 582;
        int c = 175;
        System.out.println(pin(a, b, c));
    }

    static int pin(int a, int b, int c) {
        int pin = 0;
        int place = 1;
        int largestDigit = 0;

        // First pass to find the largest digit
        for (int i = a; i > 0; i/= 10) {    // 123 ; 123 >0 ;123 = 123/10 = 12       
            largestDigit = Math.max(largestDigit, i % 10);  // (0, 12%10) 2 (0,2) =2
        }
        for (int i = b; i> 0; i /= 10) {
            largestDigit = Math.max(largestDigit, i % 10);
        }
        for (int i = c; i> 0; i /= 10) {
            largestDigit = Math.max(largestDigit, i % 10);
        }

        // Second pass to collect the smallest digits from each place value
        while (a > 0 || b > 0 || c > 0) {
            int digitA = a % 10;
            int digitB = b % 10;
            int digitC = c % 10;

            // Find the minimum digit among the current place value digits
            int minDigit = Math.min(digitA, Math.min(digitB, digitC));

            // Add the minimum digit to the pin
            pin = pin + minDigit * place; //0+2*1 =2;      2+2*10 = 22     22+1* 100 =122   
            place = place * 10;   // 10   100

            // Remove the last digit from a, b, and c
            a /= 10;
            b /= 10;
            c /= 10;
        }

        // Combine the largest digit in the thousand's place
        pin = pin + largestDigit * place;

        return pin;
    }
}
