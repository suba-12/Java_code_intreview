package Array.Assignment;

// 1920. Build array from permutation
// Input: nums = [0, 2, 1, 5, 3, 4]
// Output: [0, 1, 2, 4, 5, 3]

public class Leetcode1920 {
    public static void main(String[] args) {
        // Example input
        int[] nums = {0, 2, 1, 5, 3, 4};
        
        // Call the method to build the permutation array
        int[] result = buildArray(nums);
        
        // Print the result array
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    // Method to build the array from permutation
    public static int[] buildArray(int[] nums) {
        int n = nums.length; // Get the length of the input array
        int[] res = new int[n]; // Initialize the result array with the same length as nums

        // Iterate over each element in nums
        for (int i = 0; i < n; i++) {
            res[i] = nums[nums[i]]; // Set res[i] to the value at the index specified by nums[i] in nums
        }
        
        return res; // Return the constructed result array
    }
}
