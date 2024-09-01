package Dailycode;
// Toggle each character in a String

public class Togglechar {
    public static void main(String[] args) {
        String s = "SuBa";
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
           if(Character.isUpperCase(s.charAt(i))) 
                s1=s1+Character.toLowerCase(s.charAt(i));
           else 
                s1=s1+Character.toUpperCase(s.charAt(i));
       }
       System.out.println(s1);
        
    }
    
}

