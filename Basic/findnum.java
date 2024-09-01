public class findnum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println(missingNumber(arr));
        
    }

        // Note that the size of the array is n-1
       static int missingNumber( int arr[]) {
        int n = arr.length +1  ;
           int tot = n*(n+1)/2;
           int sum = 0;
           for (int val : arr) {
            sum += val;
           }


            return tot - sum;
        }

    }

