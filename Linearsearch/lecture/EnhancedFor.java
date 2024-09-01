package Linearsearch.lecture;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] arr = {223, 34, 4, 5, 5, 65, 45};
        int target = 34;
        boolean ans = linearnumber(arr, target);
        System.out.println(ans);
    }

    static boolean linearnumber(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
