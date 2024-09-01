package WIPRO;

public class Returnsecupper {
        public static void main(String[] args) {
            String input = "Hello world, how are you?";
            String result = getFirstAndSecondWordInUpperCase(input);
            System.out.println("Modified string: " + result); // Output: Modified string: Hello WORLD
        }
        
        static String getFirstAndSecondWordInUpperCase(String input) {
            // Split the input string by whitespace into an array of words
            String[] words = input.trim().split("\\s+");
            
            // Ensure there is at least a second word
            if (words.length > 1) {
                // Concatenate the first word and the second word in uppercase
                return words[0] + " " + words[1].toUpperCase();
            } else {
                // If there is no second word, return the original input or handle as needed
                return input;
            }
        }
    }
    

