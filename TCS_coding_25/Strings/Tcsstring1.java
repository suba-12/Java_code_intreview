package TCS_coding_25.Strings;
import java.util.Scanner;

public class Tcsstring1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the inventory list:");
        String input = sc.nextLine();
        sc.close();

        // Check if input contains numbers
        if (input.matches(".*\\d.*")) {
            System.out.println("INVALID INPUT");
            return;
        }

        String[] words = input.split("\\s+"); // Split input by spaces
        String[] uniqueWords = new String[words.length]; // To store unique words
        int[] counts = new int[words.length]; // To store word counts
        int uniqueCount = 0;

        for (String word : words) {
            boolean found = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueWords[i].equalsIgnoreCase(word)) {
                    counts[i]++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                uniqueWords[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Print result
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueWords[i].substring(0, 1).toUpperCase() + uniqueWords[i].substring(1) + " " + counts[i] + " ");
        }
    }
}


