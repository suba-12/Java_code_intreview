package String ;


public class Word {
    public static void main(String[] args) {
        String series = "";
        for (int index = 0; index < 26; index++) {
            char ch = (char)('a' + index);
            series =  series +ch; // abcdefghijklmnopqrstuvwxyz
           // series =  ch +series +ch; //zyxwvutsrqponmlkjihgfedcbaabcdefghijklmnopqrstuvwxyz
           // series =  ch +series;  //zyxwvutsrqponmlkjihgfedcba
        }
        System.out.print(series);
    }
}
