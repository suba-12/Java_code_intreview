package TCS_coding_25.TCS_question24;
/*
Input :   20 25**

Output : 23**
 */
import java.util.Scanner;
import java.util.Scanner;
public class PrimeBet {
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int e = sc.nextInt();
    sc.close();
    for(int i = s ; i < e; i++){
        if(isprime(i) && isprime(sum(i))){
            System.out.print(i+" ");
        }
    }
}

static boolean isprime(int n){
    if(n < 2){
        return false;
    }
    for (int index = 2; index *index <= n; index++) {
        if(n % index == 0){
            return false;
        }
    }
    return true;
}

static int sum(int n){
    int sum = 0;
    while(n >0){
        sum += n%10;
        n/=10;
    }
    return sum;
}
}
