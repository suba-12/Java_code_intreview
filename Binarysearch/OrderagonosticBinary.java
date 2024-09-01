package Binarysearch;

public class OrderagonosticBinary {
    public static void main(String[] args) {
        //int arr[] = {99,88,77,66,55,44,33,22};
       int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        int ans = OrderBinary(arr, target);
        System.out.println(ans);

    }


    static int OrderBinary(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        Boolean isAcs = arr[start] < arr[end];  // check asc or desc


        while(start <= end){
            int mid = start +(end - start)/2;  
            if(arr[mid] == target){  // edge case
                return mid;
            }
            if(isAcs){   // ascending order
                if(target < mid){  
                    end = mid -1;
                  }
                  else{
                      start = mid+1; 
                  }
            }
            else{   // descending order
                if(target > mid){  
                    end = mid -1;
                  }
                  else{
                      start = mid+1; 
                  }

            }
           
            

        }
        return -1;
    }
}
