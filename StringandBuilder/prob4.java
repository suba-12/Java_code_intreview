package StringandBuilder;

public class prob4 {
    public static void main(String[] args){
        int[][] arr=new int[3][4];
        for(int i=0;i<3;i++){
           for(int j=0;j<4;j++){
          arr[i][j]=i+j;
           }
        }
        System.out.println("output");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
          System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
         }
    }
}







