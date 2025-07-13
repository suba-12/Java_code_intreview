package TCSnqt;

public class FiboSeries {
    public static void main(String[] args) {
        int n = 10 ;
        fibo(n);;
    }
    static void fibo(int n){
        int a = 0;
        int b = 1;
        if(n >= 1) System.out.print(a +" ");
        if(n >= 2)System.out.print(b+" ");

        for (int index = 3; index <= n; index++) {
            int next = a+b;
            System.out.print(next +" ");
            a = b ;
            b= next;
        }
        System.out.println();
    }
}
