package Binarysearch;

public class Binaryser {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int ans = Binary(arr, target);
        System.out.println(ans);

    }
    static int Binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start +(end - start)/2;  // 0+(10-0)/2 = 5
            if(target < mid){   // 7 < 5
              end = mid -1;
            }
            else if(target > mid){
                start = mid+1; // 7 >5
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
