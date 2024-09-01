package WIPRO;

public class Nonrep {
 
    public static void main(String[] args) {
     
                int number = 12113;
                int uniqueCount = countUniqueDigits(number);
                System.out.println("Number of unique digits in " + number + " is: " + uniqueCount);
            }
            
    
  
        // Function to count unique digits in a number
        public static int countUniqueDigits(int number) {
            int[] digitCount = new int[10]; // Array to count occurrences of each digit
           // int uniqueCount = 0;
            
            // Count occurrences of each digit
            while (number > 0) {
                int digit = number % 10;
                digitCount[digit]++;
                number /= 10;
            }
            
            // Count unique digits
            int nonRepetitiveCount = 0;
            for (int i = 0; i < 10; i++) {
                if (digitCount[i] == 1) {
                    nonRepetitiveCount++;
                }
            }
    
            return nonRepetitiveCount;
        }
            
        
}
