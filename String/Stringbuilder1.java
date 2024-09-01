package String;

public class Stringbuilder1 {
    public static void main(String[] args) {
        StringBuilder build  = new StringBuilder();
        for (int index = 0; index < 26; index++) {
            char ch = (char)('a'+index);
            build.append(ch);
            
        }
        System.out.print(build);

        build.deleteCharAt(0);
        System.out.println(build);

    }
}
