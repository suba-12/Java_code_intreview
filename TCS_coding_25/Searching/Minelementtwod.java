package TCS_coding_25.Searching;
//import java.util.*;

/*int[][] arr = {
    {23,3,4},
    {34,45,56},
    {23,34,2}
};
*/
import java.util.Scanner;
public class Minelementtwod {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("eneter the row  for the array : ");
    int row = sc.nextInt();

    System.out.print("eneter the  column for the array : ");
    int col = sc.nextInt();

    System.out.print("enter the array elements :");

    int[][] array = new int[row][col];
    for (int index = 0; index < array.length; index++) {
        for(int j = 0; j < row ; j++){
        array[index][j]= sc.nextInt();
        }
    }

 int res = min(array);
 System.out.print("minimum element is " + res);

    }

static int min(int[][] array){
    int min = array[0][0];
    for (int index = 0; index < array.length; index++) {
        for (int ind= 0; ind < array[index].length ;ind++){
            if(array[index][ind] <min){
                min = array[index][ind];
        }
    }
}
return min;

}
}