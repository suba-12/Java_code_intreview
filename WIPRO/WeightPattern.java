package WIPRO;

public class WeightPattern {
  
        public static void main(String[] args) {
            int inp1 = 5; // number of rows
            int inp2 = 10; // starting number
            int inp3 = 2; // increment value
            int result = weight(inp1, inp2, inp3);
            System.out.println("The total weight of the hill is: " + result); // Expected output: 230
        }
    
        static int weight(int inp1, int inp2, int inp3) {
            int sum = 0;
            int currentNumber = inp2;
    
            for (int row = 1; row <= inp1; row++) {
                for (int col = 1; col <= row; col++) {
                    sum  = sum + currentNumber;
                }
                currentNumber = currentNumber +inp3;
            }
            return sum;
        }
    }
    



