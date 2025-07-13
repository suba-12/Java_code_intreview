package TCSnqt;

import java.util.HashMap;


    public class Subarraycount {
        public static int subarraySum(int[] nums, int sum) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 1); // Initialize with sum 0
            int count = 0, currentSum = 0;
    
            for (int num : nums) {
                currentSum += num;
                if (map.containsKey(currentSum - sum)) {
                    count += map.get(currentSum - sum);
                }
                map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1, 1, 1};
            int sum = 3;
            System.out.println(subarraySum(nums, sum)); // Output: 4
        }
    }
    
