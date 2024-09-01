package Array.Assignment;

public class Leetcode1512 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}

//good pairs.1512. Number of Good Pairs

//Example 1:

//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
