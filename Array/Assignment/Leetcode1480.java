package Array.Assignment;

public class Leetcode1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        ArrayFibo(nums);

        for (int val : nums) {
            System.out.print(val+" ");
            
        }
         
        }
        static int[] ArrayFibo(int[] nums ){
            for(int i =1;i<nums.length;i++){
                 nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}
