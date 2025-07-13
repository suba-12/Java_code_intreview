package TCS_coding_25.Revision;
import java.util.Scanner;
public class Set0302 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count =0;
        int count1=0;
        for(int i = 0 ; i < a.length();i++){
            char ch =a.charAt(i);
            if(ch =='*'){
             count++;
            }
            else if (ch =='#'){
                count1++;
            }
        }
        if( count == count1){
            System.out.println("0");
        }else {
            System.out.println(count-count1);
        }
       
    }
}
