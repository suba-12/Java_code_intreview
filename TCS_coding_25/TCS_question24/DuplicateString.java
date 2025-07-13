package TCS_coding_25.TCS_question24;
/*
 **Example:**

**Input:**

Watermelon apple orange banana orange lemon apple

**Output:**

apple banana lemon orange watermelon

watermelon orange lemon banana apple
 */
import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        String input = sc.nextLine();
        sc.close(); 

        String[] words = input.split("\\s+"); // Splitting input into words
        int n = words.length;
        String[] uniqueWords = new String[n]; 
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (words[i].equals(uniqueWords[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueWords[count++] = words[i]; // Store unique word
            }
        }

        
        for (int index = 0; index < count; index++) {
            System.out.print(uniqueWords[index] + " ");
        }
        System.out.println();

        
        for (int index = count - 1; index >= 0; index--) {
            System.out.print(uniqueWords[index] + " ");
        }
        System.out.println();
    }
}
