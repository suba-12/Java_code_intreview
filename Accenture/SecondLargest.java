package Accenture;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int tmax = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int fmax = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            if(index > fmax){
             tmax = smax;
             smax = fmax;
             fmax = index;
            } 
            else if(index > smax){
                tmax =smax;
                smax = index;
            }
            else if(index > tmax){
                tmax = index;
            }
        }
        System.out.println(fmax);
       
    }
}
