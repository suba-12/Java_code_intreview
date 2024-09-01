
package WIPRO;

public class Isount {
    public static void main(String[] args) {
     
                int number = 12113;
                int uniqueCount = countUniqueDigits(number);
                System.out.println("Number of unique digits in " + number + " is: " + uniqueCount);
            }
            
    
  
        // Function to count unique digits in a number
        public static int countUniqueDigits(int number) {
            int[] digitCount = new int[10]; // Array to count occurrences of each digit
            int uniqueCount = 0;
            
            // Count occurrences of each digit
            while (number > 0) {
                int digit = number % 10;
                digitCount[digit]++;
                number /= 10;
            }
            
            // Count unique digits
            for (int count : digitCount) {
                if (count > 0) {
                    uniqueCount++;
                }
            }
            
            return uniqueCount;
        }
    }