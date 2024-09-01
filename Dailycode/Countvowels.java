package Dailycode;
//count vowels in the string

public class Countvowels {
    public static void main(String[] args) {
        String  s = "Subashini";
        int count =0;

        s.toLowerCase();
        for (int index = 0; index < s.length(); index++) {
            char c = s.charAt(index);
            if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c  == 'u'){
                  count++;
            }
            
        }
        System.out.println(count);



    }
}
