package String;

public class consecutive1s {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(cons(n));
    }
    static int cons(int n ){
        int[] a = new int[n];
        int[] b = new int[n];
        a[0]=b[0] =1;
        for (int index = 1; index < n; index++) {
            a[index] = a[index - 1]+ b[index -1];
            b[index] = a[index -1];
            
        }

        return (1 << n) - a[n-1] - b[n-1];
    }
}
