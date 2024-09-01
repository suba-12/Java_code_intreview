package WIPRO;


public class StringPalindrome {
    public static void main(String[] args) {
        String input1 = "Madam";
        System.out.println(input1 + " is palindrome? " + pali(input1)); // Output: Madam is palindrome? 2
    }

    static int pali(String input1) {
        String n = input1.toLowerCase();
        for (int i = 0; i <= n.length() / 2; i++) {
            if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
                return 1; // Not a palindrome
            }
        }
        return 2; // Palindrome
    }
}
