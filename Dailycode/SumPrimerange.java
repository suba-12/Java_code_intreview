package Dailycode;

// input : 10 
// output : 2,3,5,7  => 17
public class SumPrimerange {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
       for (int index = 2; index < n; index++) {
        if(sumprime(index)){
            sum += index;
        }
       }
        System.out.println(sum);

    }

    static boolean sumprime(int num){
         if(num <= 1) return false;
        for (int index = 2; index < num; index++) {
           if(num %index  == 0) return false;     
           }
           return true;
    }
}
