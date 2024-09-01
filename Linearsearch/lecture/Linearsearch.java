package Linearsearch.lecture;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {230,34,45,23,13,324,2234,34};
        int target = 231;
        int ans = linearnumber( arr , target);
        System.out.println(ans);
    }
    
    static int linearnumber(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
           // int element = ;
            if(arr[index] == target){
                return index;
            }
            
        }
        return -1;
    }
}
