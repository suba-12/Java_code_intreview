package Curious.Twopointers;

import java.util.Arrays;

public class Triplesum {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int x = 24;
        int[] result = triple(arr, x);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No triplet found");
        }
    }

    static int[] triple(int[] arr, int x) {
        for (int index = 0; index < arr.length - 2; index++) {
            for (int j = index + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[index] + arr[j] + arr[k] == x) {
                        return new int[]{arr[index], arr[j], arr[k]};
                    }
                }
            }
        }
        return null;
    }
}
