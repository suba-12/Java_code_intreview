package Dailycode;

public class RemoveBackets {
    public static void main(String[] args) {
        String s = "a+(((b+c-(d+e)";
        remove(s);
    }
    static void remove(String s){
        Boolean  valid = false;
        StringBuffer res = new StringBuffer();

        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            if(ch == '(') valid = false;
            else if(ch == ')') valid = false;
            else{
                if(!valid) 
                res.append(ch);
            }
           

            
        }
        System.out.print(res.toString());
    }
}

