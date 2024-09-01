package Dailycode;
// remove the other strings except alphbets
public class RemoveSpecialchar {
    public static void main(String[] args) {
        String s = "@sh^&09S";
        
        for (int index = 0; index < s.length(); index++) {
            if(s.charAt(index) < 'A' || s.charAt(index) > 'Z' && s.charAt(index) < 'a' || s.charAt(index) > 'z' ){
               s =  s.substring(0, index)+s.substring(index+1);
               index--;
            }
            
        }
        System.out.println(s);
    }
}
