import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {

        Scanner inn = new Scanner(System.in);
        int a = inn.nextInt();
        int b = inn.nextInt();
        int c = inn.nextInt();
        /*int max = a;
        if(b >max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);*/

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}
