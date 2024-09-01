package Curious;

public class Perfectnum {
    public static void main(String[] args) {
        int n =15;
        System.out.println(perfect(n));
    }

    static int perfect(int n){
        int sum =0;
        for (int index = 1; index < n; index++) {
            if(n%index ==0){
                sum = index+sum;
              
            }          
        }
        if(sum == n) return 1;
        else return 2;

        }
    }
   


