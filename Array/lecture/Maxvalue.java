package Array.lecture;

public class Maxvalue {
    public static void main(String[] args) {
        int[] arr = {23,34,1,23,345};
    System.out.println(maxRange(arr,0,5));



    }
    static int maxRange(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }
        if(arr  == null){
            return -1;
        }
        int maxvalue = arr[start];
        for (int index = start; index < end; index++) {
            if(maxvalue < arr[index]){
                maxvalue = arr[index];
            }
            
        }
        return maxvalue;
        
    }


    static int maxi(int[] arr){
        if (arr.length ==0){
            return -1;
        }
        int maxvalue = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(maxvalue < arr[index]){
                maxvalue = arr[index];
            }
            
        }
        return maxvalue;
        
    }
}
