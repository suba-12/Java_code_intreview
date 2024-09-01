package Linearsearch.lecture;

public class Rangesearch {
    public static void main(String[] args) {
        int[] arr = {230,34,45,23,13,324,2234,34};
        int target = 34;
        int start =1;
        int end=5;
        int ans = linearnumber( arr , target,start,end);
        System.out.println(ans);
    }
    
    static int linearnumber(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
           // int element = ;
            if(arr[index] == target){
                return index;
            }
            
        }
        return -1;
    }
}
