package FunctionandMethod;

public class Shadowing {
    static int x =20;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 60;
        System.out.println(x);

    }
}
