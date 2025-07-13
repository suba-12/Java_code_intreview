
package Subarrays;

import java.util.HashMap;
import java.util.Scanner;
//import java.util.HashMap;

public class LongSAwithSumK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(sum(arr, k));
    }

    static int sum(int[] arr, int k) {
        int current = 0;
        int maxlength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            current = current + arr[i];
            if (current == k) {
                maxlength = i + 1;
            }
            if(map.containsKey(current - k)){
            maxlength = Math.max(maxlength , i - map.get(current - k));
            }
            if(!map.containsKey(current)){
                map.put(current , i);
            }
        }
        return maxlength;
    }
}
