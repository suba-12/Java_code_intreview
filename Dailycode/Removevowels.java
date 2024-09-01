package Dailycode;
// remove vowels 
public class Removevowels {
   public static void main(String[] args) {
    String s = "Suba";
    StringBuffer r = new StringBuffer();
    s.toLowerCase();
    for (int index = 0; index < s.length(); index++) {
        char c = s.charAt(index);
        if(c != 'a' && c != 'e' && c != 'i' && c !='o' && c  != 'u'){
            r.append(c);
        }
        
    }
    System.out.println(r.toString());
   } 
}
