package Accenture;

import java.util.Arrays;
/*
 Small Large Sum
Q.1 Write a function SmallLargeSum(array) which accepts the array as an argument or parameter,
 that performs the addition of the second largest element from the even location 
 with the second largest element from an odd location?
 */

// input ; {2,5,3,4,1,6,8,9}
// output : 7
public class Odd {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 2, 1, 6, 8, 9, 10, 11 };
        // 2,3,1,8 = 3 5,4,6,9 6
        System.out.println(oddeven(arr));

    }

    static int oddeven(int[] arr) {
        int first = Integer.MIN_VALUE;
        int sec = 0;

        int odfirst = Integer.MIN_VALUE;
        int odsec = 0;

        for (int index = 0; index < arr.length; index++) {
            if (index % 2 == 0) {
                if (first < arr[index]) {
                    sec = first;
                    first = arr[index];
                } else if (sec < arr[index] && arr[index] != first)
                    sec = arr[index];
            } else {
                if (odfirst < arr[index]) {
                    odsec = odfirst;
                    odfirst = arr[index];
                } else if (odsec < arr[index] && arr[index] != odfirst) {
                    odsec = arr[index];
                }

            }
        }

        return sec + odsec;

    }
}