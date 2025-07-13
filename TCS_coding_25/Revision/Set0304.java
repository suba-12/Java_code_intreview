package TCS_coding_25.Revision;
import java.util.Scanner;

public class Set0304 {

   
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            String input = sc.nextLine().replace("[","").replace("]","");
            String[] element = input.split(" ");
            int[][] arr = new int[r][c];
            int index = 0;
            for (int i = 0; i < r; i++) {
                for (int j= 0; j < c; j++) {
                    arr[i][j] = Integer.parseInt(element[index++]);
                }
                
            }

            int max = 0;
           
            int row = 0;
            for (int i = 0; i < r; i++) {
                int num = 0;
                for (int j= 0; j < c; j++) {
                    if( arr[i][j]==1){
                        num++;
                    }
                    
                }
                if(num > max){
                    max = num;
                    row = i+1;

                }
                
            }


           System.out.println(row);
        }
    }
       

