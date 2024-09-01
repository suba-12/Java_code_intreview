package String;

public class Palindrom {
    public static void main(String[] args) {
        String a = " madam";
        isPalindrome(a);
    }
    static boolean isPalindrome(String a){
        
        a = a.toLowerCase();

        for (int index = 0; index < a.length() / 2; index++) {
            char start = a.charAt(index);
            char last  = a.charAt(a.length() - 1);
            if(start != last){
               return false;
            }

            
        }

        return true;
    }
}
