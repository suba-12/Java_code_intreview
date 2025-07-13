package TCSnqt;

import java.util.Arrays;

public class Fibo {
    public static void main(String[] args) {
       int num = 6;
       int[] res = fibo1(num);
       System.out.println(Arrays.toString(res));
       

    }
    static int[] fibo1(int num){
       int[] fibo = new int[num];

       fibo[0] = 0;
       if(num >= 1) fibo[1] = 1;
       for (int index = 2; index < num; index++) {
        fibo[index]= fibo[index - 1]+fibo[index-2];
       }
       return fibo;


      }

    }
    

