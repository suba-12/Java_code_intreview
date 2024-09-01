package Accenture;
/*
 Q.2 Write a function CheckPassword(str) which will accept the string as an argument or parameter and validates the password. 
 It will return 1 if the conditions are satisfied else it’ll return 0?

 The password is valid if it satisfies the below conditions:
It should contain at least 4 characters.
At least 1 numeric digit should be present.
1 Capital letter should be there.
Password should not contain space or slash.
The starting character should not be a number.
Sample Test Case:

Input:

bB1_89

Output:

1
 */

public class CheckPassword {
    public static void main(String[] args) {
        String s = "bB1_89";
        System.out.println(CheckPassword(s)); // Expected output: 1
    }

    static int CheckPassword(String s) {
        if (s.length() < 4) {
            return 0; // Password must be at least 4 characters long
        }

        // Check if the first character is a number
        char firstChar = s.charAt(0);
        if (firstChar >= '0' && firstChar <= '9') {
            return 0; // First character should not be a number
        }

        boolean hasDigit = false;
        boolean hasCapital = false;

        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);

            // Check for numeric digit
            if (c >= '0' && c <= '9') {
                hasDigit = true;
            }

            // Check for capital letter
            if (c >= 'A' && c <= 'Z') {
                hasCapital = true;
            }

            // Check for space or slash
            if (c == ' ' || c == '/') {
                return 0; // Password should not contain space or slash
            }
        }

        // Ensure both conditions are met
        if (hasDigit && hasCapital) {
            return 1;
        }

        return 0;
    }
}
