package TCS_coding_25.Strings;
//Count number of vowels, consonants, spaces in a string
//Input: Hello World
//Vowels: 3
//Consonants: 7
//Spaces: 1


import java.util.Scanner;
public class CountVCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        int s = 0 , c = 0 , v = 0;
        for(int i = 0 ; i < word.length() ; i++ ){
            char ch =word.charAt(i);
            if(ch == ' '){
                s++;
            }else if(ch >='a' && ch <= 'z'){
                if(ch =='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    v++;
                }else{
                    c++;
                }
            }
        }
        System.out.println("spaces"+" "+s);
        System.out.println("vowels"+ " "+v);
        System.out.println("consonats"+" "+c);



sc.close();
    }
}
