package Array.Matrix;

public class Spiral {
    
        public static void main(String[] args) {
            int n = 5; // Size of the matrix
            int[][] matrix = generateSpiralMatrix(n);
            printMatrix(matrix);
        }
    
        public static int[][] generateSpiralMatrix(int n) {
            int[][] matrix = new int[n][n];
            int value = 1;
            int top = 0, bottom = n - 1, left = 0, right = n - 1;
    
            while (value <= n * n) {
                // Traverse from left to right
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = value++;
                }
                top++;
    
                // Traverse downwards
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = value++;
                }
                right--;
    
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
    
                // Traverse upwards
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
    
            return matrix;
        }
    
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int num : row) {
                    System.out.printf("%4d", num);
                }
                System.out.println();
            }
        }
    }
    