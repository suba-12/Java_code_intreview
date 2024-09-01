package Linearsearch.lecture;

import java.util.Arrays;

public class Stringsearch {
    public static void main(String[] args) {
        String arr = "subashini";
        char target = 'a';
        System.out.println(Stringsearchelement(arr, target));
        System.out.println(Arrays.toString(arr.toCharArray()));
    }

    static boolean Stringsearchelement(String arr, char target) {
        if (arr.length() == 0) {
            return false;
        }
        for (char ch : arr.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
