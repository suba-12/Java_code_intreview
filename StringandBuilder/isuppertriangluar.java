package StringandBuilder;
import java.util.Scanner;
public class isuppertriangluar {
    public static void main(String[] args){

        boolean isupper=true;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n&&isupper;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i][j]!=0){
                    isupper=false;
                }
            }
        }
        sc.close();
    }
}
