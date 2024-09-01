public class Perfect{

    // [1,2,3,4,9]
    //  count :3
    // sum 

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9};

    }
    public class PerfectSquareCounter {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 9};
            int count = 0;
    
            for (int i = 0; i < arr.length; i++) {
                if (isPerfectSquare(arr[i])) {
                    count++;
                }
            }
    
            System.out.println(count);
        }
    
        private static boolean isPerfectSquare(int num) {
            if (num < 0) {
                return false;
            }
    
            for (int i = 1; i * i <= num; i++) {
                if (i * i == num) {
                    return true;
                }
            }
    
            return false;
        }
    }
}
    