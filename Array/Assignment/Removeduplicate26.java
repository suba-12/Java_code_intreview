package Array.Assignment;

import java.util.Arrays;
// give the input in sorted array
//[1,1,2]
//output : [1,2,_]
public class Removeduplicate26 {
    public static void main(String[] args) {
          int[] nums = {1,2,2};
          int length = remove(nums);
          System.out.println("Modified Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nLength of Modified Array: " + length);

    }
    static int remove(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
