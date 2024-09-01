package Array.lecture;

public class Rowcol {
   public static void main(String[] args) {
    int[][] arr = {
        {1,2,3,4,5},
        {34,45},
        {56,78}
    };
    for (int index = 0; index < arr.length; index++) {
        for (int col = 0; col < arr[index].length; col++) {
            System.out.print(arr[index][col]+" ");
            
        }

        System.out.println(" ");
    }

    
   } 
}
