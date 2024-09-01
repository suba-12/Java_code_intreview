public class Reversenumbers {
 public static void main(String[] args) {
    int a = 23453;
    int sum = 0;
     while(a > 0){
        int rem = a %10; // last number 3
        sum = sum *10+rem;
        a = a/10;  // qoutient 2345


    }

    System.out.println(sum);
 }   
}
//input :23453;
//output :35432