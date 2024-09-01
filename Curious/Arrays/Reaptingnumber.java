package Curious.Arrays;

public class Reaptingnumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,5,4,4,5};
       //repeating(nums); 
       repeating1(nums);
    }
    static void repeating(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];
        if (nums.length == 0) {
            System.out.println("invalid");
        }
        for (int i = 1; i < nums.length; i++) {
          arr[nums[i]]++;
          if(arr[nums[i]] > 1){
            System.out.println(nums[i]);

          }

        }     
         }



         static void repeating1(int[] nums){
            int n = nums.length;
            if (nums.length == 0) {
                System.out.println("invalid");
            }
            for (int i = 1; i < n; i++) {
             for (int index = i+1; index < nums.length; index++) {
                if (nums[i] == nums[index]) {
                    System.out.println("First repeating number: " + nums[i]);
                    return;
                
             }
    
            }     
             }
             System.out.println("No repeating number found");

            }






}



