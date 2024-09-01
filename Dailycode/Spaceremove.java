package Dailycode;

public class Spaceremove {
    public static void main(String[] args) {
        String s = " My name is suba";
        StringBuilder s1 = new StringBuilder();
        
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) != ' ') {
                s1.append(s.charAt(index));
            }
        }
        
        System.out.println(s1.toString());
    }
}
