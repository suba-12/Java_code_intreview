package TCSnqt;
import java.util.Scanner;
//input = {2,0,3,0,5}
// output = {2,3,5,0,0}
public class Zerolast {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {2,0,3,0,5};
    zero(arr);
    for(int val : arr){
        System.out.print(val +" ");
    }

 }   
static void zero(int[] arr){
    int count=0;
for(int i = 0 ; i < arr.length ;i++ ){
    if(arr[i] != 0){
      arr[count] = arr[i];
      count++;
    }

}
 while(count < arr.length){
    arr[count] = 0;
    count++;
    
 }
}

}