package TCSnqt;
import java.util.Scanner;
// {1,2,3,4,5}
public class Sumofarrays {
   public static void main(String[] args){
  int[] arr = {1,2,3,4,5};
  int sum = 0;
  for(int i = 0; i < arr.length;i++){
   sum = sum+arr[i];
  }
  System.out.println(sum);
   } 

}
