package Dailycode;

public class Freqcountstr {
        public static void main(String[] args) {
            String str = "picture perfect";
            int[] frq = new int[str.length()];
            char[] characters = str.toCharArray();
    
            for (int i = 0; i < str.length(); i++) {
                frq[i] = 1;
                for (int j = i + 1; j < str.length(); j++) {
                    if (characters[i] == characters[j]) {
                        frq[i]++;
                        characters[j] = '\0'; // Mark this character as counted
                    }
                }
            }
    
            for (int i = 0; i < str.length(); i++) {
                if (characters[i] != ' ' && characters[i] != '\0') {
                    System.out.println(characters[i] + " " + frq[i]);
                }
            }
    }
}
