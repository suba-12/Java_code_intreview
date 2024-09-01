
package WIPRO;

//input :  {10,41,18,50,43,31,29,25,59,96,67};
//output :241
//condition : if the element does not contain any prime then add all numbers without the smalllest number
public class Addprimewithoutsmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(smallest(arr));
    }

    static int smallest(int[] arr) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean hasPrime = false;

        for (int val : arr) {
            if (isPrime(val)) {
                hasPrime = true;
                sum += val;
            }
            if (val < min) {
                min = val;
            }
        }

        if (!hasPrime) {
            sum = 0;
            for (int val : arr) {
                sum += val;
            }
            sum -= min;
        }

        return sum;
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}





















