package Array.Assignment;

public class Diagonalmatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            primaryDiagonalSum += arr[i][i]; // Summing primary diagonal elements
            secondaryDiagonalSum += arr[i][arr.length - 1 - i]; // Summing secondary diagonal elements
        }

        System.out.println("Sum of primary diagonal elements: " + primaryDiagonalSum);
        System.out.println("Sum of secondary diagonal elements: " + secondaryDiagonalSum);
    }
}
