package StringandBuilder;
import java.util.*;
public class prob7 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int row=sc.nextInt();
     sc.nextLine();
     String[][] arr=new String[row][3];
     for(int i=0;i<row;i++){
        for(int j=0;j<3;j++){
        arr[i][j]=sc.nextLine();
        }
     }
     System.out.println(Arrays.deepToString(arr));
     sc.close();
    }
}
