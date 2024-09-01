package Dailycode;
//Input string :- “4PREP2INSTAA6”
//Output :- 12
public class CountAlp {
    public static void main(String[] args) {
        String s = "4PREP2INSTAA6";
        count(s);
    
       } 
       static void count(String s){
        int sum=0;
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
           if(ch >= '0' || ch <= '9'){
            sum += ch - '0';
           }
            
        }
        System.out.println(sum);
       }
    }
    

