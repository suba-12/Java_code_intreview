package Dailycode;

public class Stgnum {
    public static void main(String[] args) {
        String s = "m1o2n9"; // moon
        prtsrig(s);

    }

    static void prtsrig(String s) {
        StringBuffer result = new StringBuffer();
        int num = 0;
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
             if (Character.isDigit(c)) {
                num = Character.getNumericValue(c);

                if (index > 0) {
                    char nextChar = s.charAt(index - 1);
                    for (int i = 0; i < num; i++) {
                        result.append(nextChar);
                    }  
                }
            }
        }
        System.out.println(result.toString());
    }
}
