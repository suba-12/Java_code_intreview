package WIPRO;

public class Digit {
    public static void main(String[] args) {
        int a = 123; //output 3
        System.out.println(digit(a));
    }
    static int digit(int a){
        int count = 0;   
        while(a != 0){
            
            a = a/10;
            count++;

        }
       
        return count;
       
    }
}
