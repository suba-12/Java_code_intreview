package TCS_coding_25.Array;
// 34 56 7 12 3
//op : 12
import java.util.*;
public class ThirdLargest {
    
      public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
      
       String input = sc.nextLine();
       System.out.print(third(input));

      
       sc.close();
    }
    static int third(String input){
        String[] val = input.split(" ");

        int flarg = Integer.MIN_VALUE;
        int slarg = Integer.MIN_VALUE;
        int tlarg = Integer.MIN_VALUE;

        for(int i = 0 ; i < val.length ; i++){
            int arr = Integer.parseInt(val[i]);

            if( arr > flarg){
                tlarg = slarg;
                slarg = flarg;
                flarg =arr;
            }
            else if(arr > slarg && arr < flarg){
                tlarg = slarg;
                slarg = arr;
            }
            else if(arr >  tlarg && arr < slarg){
                tlarg = arr;
            }
        }
return tlarg;
    }
}

